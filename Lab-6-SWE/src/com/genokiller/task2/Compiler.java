package com.genokiller.task2;

/**
 * Інтерфейс Compiler визначає метод компіляції вихідного коду.
 */
public interface Compiler {

    /**
     * Компілює вихідний код у виконувану форму.
     *
     * @param source вихідний код
     */
    void compile(String source);
}

