package com.genokiller.task2;

/**
 * Інтерфейс IDEToolsFactory описує створення сімейства інструментів
 * інтерактивного середовища розробки (IDE).
 *
 * Патерн: Abstract Factory.
 */
public interface IDEToolsFactory {

    /**
     * Створює компонент для перевірки коду.
     *
     * @return об'єкт Validator
     */
    Validator createValidator();

    /**
     * Створює компонент-компілятор.
     *
     * @return об'єкт Compiler
     */
    Compiler createCompiler();

    /**
     * Створює компонент-дебагер.
     *
     * @return об'єкт Debugger
     */
    Debugger createDebugger();
}

