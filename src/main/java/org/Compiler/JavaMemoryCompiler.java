package org.Compiler;

import javax.tools.*;
import java.util.Collections;

public class JavaMemoryCompiler {
    public static void compile(String sourceCode) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();

        JavaFileObject file = new JavaSourceFromString("org.Grammar.Out", sourceCode);

        Iterable<? extends JavaFileObject> compilationUnits = Collections.singletonList(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null, null, diagnostics, null, null, compilationUnits);

        boolean success = task.call();
        diagnostics.getDiagnostics().forEach(diagnostic -> {
            System.out.println(diagnostic.getCode());
            System.out.println(diagnostic.getKind());
            System.out.println(diagnostic.getPosition());
            System.out.println(diagnostic.getStartPosition());
            System.out.println(diagnostic.getEndPosition());
            System.out.println(diagnostic.getSource());
            System.out.println(diagnostic.getMessage(null));
        });

        System.out.println("Success: " + success);
    }
}
