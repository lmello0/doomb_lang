package org.Compiler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.AntlrAutoGen.DoombLexer;
import org.AntlrAutoGen.DoombParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.*;

public class Doomb {
    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Gson GSON = new Gson();

    private static int scope = 0;

    public static final HashMap<Integer, String> tokensMap = new HashMap<>();

    public static String toJson(ParseTree tree) {
        return toJson(tree, true);
    }

    public static String toJson(ParseTree tree, boolean prettyPrint) {
        return prettyPrint ? PRETTY_PRINT_GSON.toJson(toMap(tree)) : GSON.toJson(toMap(tree));
    }

    public static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<>();
        traverse(tree, map);
        return map;
    }

    private static void traverse(ParseTree tree, Map<String, Object> map) {
        if (tree instanceof TerminalNodeImpl) {
            Token token = ((TerminalNodeImpl) tree).getSymbol();

            map.put("type", tokensMap.get(token.getType()));
            map.put("value", token.getText());
            map.put("scope", scope);

            if (token.getType() == 38) {
                scope++;
            }

            if (token.getType() == 39) {
                scope--;
            }
            return;
        }

        List<Map<String, Object>> children = new ArrayList<>();
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "");

        map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Map<String, Object> nested = new LinkedHashMap<>();

            children.add(nested);

            traverse(tree.getChild(i), nested);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("No file given");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()  || file.isDirectory() || !file.getName().endsWith(".doomb")) {
            System.out.println("This file is not a valid file");
            System.exit(1);
        }

        String outPath = "";
        if (args[1].equals("-o")) {
            outPath = args[2];

            if (!(new File(outPath).isDirectory())) {
                System.out.println("This is not a valid output location");
                System.exit(1);
            }
        }

        CharStream input = CharStreams.fromFileName(file.getAbsolutePath());

        DoombLexer lexer = new DoombLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DoombParser parser = new DoombParser(tokens);

        ParseTree tree = parser.program();

        for(int i = 0; i < lexer.getVocabulary().getMaxTokenType(); i++) {
            tokensMap.put(i, lexer.getVocabulary().getSymbolicName(i));
        }

        String filePath = Paths.get(outPath, file.getName().replace(".doomb", ".json")).toString();

        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.append(toJson(tree));

        writer.close();

        ASTDecoupler decoupler = new ASTDecoupler(toMap(tree));

        decoupler.uncouple();
    }
}
