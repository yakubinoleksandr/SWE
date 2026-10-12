package com.genokiller.Task2;

/**
 * Інтерфейс, який описує співробітника служби підтримки.
 * Кожен обробник може або обробити запит, або передати його далі по ланцюгу.
 */
public interface Handler {
    /**
     * Встановлює наступного обробника у ланцюжку.
     *
     * @param nextHandler наступний обробник
     */
    void setNextHandler(Handler nextHandler);

    /**
     * Обробляє запит або передає його далі, якщо рівень не відповідає компетенції.
     *
     * @param request запит на підтримку
     */
    void handleRequest(SupportRequest request);
}
