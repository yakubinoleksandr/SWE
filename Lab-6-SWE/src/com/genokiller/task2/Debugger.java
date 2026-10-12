package com.genokiller.task2;

/**
 * Інтерфейс Debugger визначає метод для запуску відлагодження програми.
 */
public interface Debugger {

    /**
     * Запускає процес відлагодження програми.
     *
     * @param program виконуваний код або ідентифікатор програми
     */
    void debug(String program);
}

