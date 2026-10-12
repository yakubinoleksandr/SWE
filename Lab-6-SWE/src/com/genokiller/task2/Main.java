package com.genokiller.task2;

/**
 * Клас Main демонструє використання патерна Abstract Factory
 * для створення інструментів IDE різних мов програмування.
 */
public class Main {

    public static void main(String[] args) {

        // Вибір конкретної фабрики (Java або C++)
        IDEToolsFactory factory = new JavaIDEToolsFactory();
        // IDEToolsFactory factory = new CppIDEToolsFactory();

        // Створення інструментів
        Validator validator = factory.createValidator();
        Compiler compiler = factory.createCompiler();
        Debugger debugger = factory.createDebugger();

        // Демонстрація роботи інструментів
        validator.validateCode("class X {}");
        compiler.compile("public class X {}");
        debugger.debug("JavaProgram");
    }
}

