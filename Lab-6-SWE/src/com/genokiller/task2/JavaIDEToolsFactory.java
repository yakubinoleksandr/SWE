package com.genokiller.task2;


/**
 * Фабрика інструментів для мови Java.
 *
 * Створює Java-реалізації Validator, Compiler та Debugger.
 */
public class JavaIDEToolsFactory implements IDEToolsFactory {

    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }
}

