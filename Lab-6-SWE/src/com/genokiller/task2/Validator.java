package com.genokiller.task2;

/**
 * Інтерфейс Validator визначає метод для перевірки коректності коду.
 */
public interface Validator {

    /**
     * Виконує перевірку синтаксису чи структури коду.
     *
     * @param code вихідний код для перевірки
     */
    void validateCode(String code);
}

