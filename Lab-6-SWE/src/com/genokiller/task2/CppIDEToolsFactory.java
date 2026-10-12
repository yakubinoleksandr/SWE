package com.genokiller.task2;


/**
 * Фабрика інструментів для мови C++.
 *
 * Створює C++-реалізації Validator, Compiler та Debugger.
 */
public class CppIDEToolsFactory implements IDEToolsFactory {

    @Override
    public Validator createValidator() {
        return new CppValidator();
    }

    @Override
    public Compiler createCompiler() {
        return new CppCompiler();
    }

    @Override
    public Debugger createDebugger() {
        return new CppDebugger();
    }
}

