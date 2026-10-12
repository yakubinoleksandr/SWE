package com.genokiller.task2;

/**
 * Реалізація Compiler для мови Java.
 */
public class JavaCompiler implements Compiler {

    @Override
    public void compile(String source) {
        System.out.println("Compiling Java source...");
    }
}

