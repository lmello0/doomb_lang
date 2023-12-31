package org.Compiler;

import org.AntlrAutoGen.DoombBaseListener;
import org.AntlrAutoGen.DoombLexer;
import org.AntlrAutoGen.DoombParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Doomb {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("No file given");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()  || file.isDirectory() || !file.getName().endsWith(".doomb")) {
            System.out.println("This file is not a valid file");
            System.exit(1);
        }

        String outPath = "";
        if (args.length > 1 && (args[1].equals("-o") || args[1].equals("--output"))) {
            if (args.length > 2) {
                outPath = args[2].replace("\\", "/");

                if (!(new File(outPath).isDirectory())) {
                    System.out.println("This is not a valid output location");
                    System.exit(1);
                }
            }

            outPath = outPath.endsWith("/") || outPath.endsWith("\\") ? outPath : outPath + "/";
        }

        StringBuilder concArgs = new StringBuilder();
        for (String arg : args) {
            concArgs.append(arg);
        }

        boolean showCode = concArgs.indexOf("--show") != -1;

        CharStream input = CharStreams.fromFileName(file.getAbsolutePath());

        DoombLexer lexer = new DoombLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        DoombParser parser = new DoombParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());


        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        DoombBaseListener listener = new DoombBaseListener();

        walker.walk(listener, tree);

        String javaCode = listener.getJavaCode();

        if (showCode) System.out.println(javaCode);

        JavaMemoryCompiler.compile(javaCode);

        Files.createDirectories(Paths.get(outPath));

        File outFile = new File("Out.class");
        String finalPath = outFile.getAbsolutePath().replace(
                outFile.getAbsolutePath().substring(0, outFile.getAbsolutePath().lastIndexOf("\\")),
                outPath
        );

        if (!outPath.isEmpty()) {
            Files.move(Path.of(outFile.toURI()), Path.of(finalPath), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
