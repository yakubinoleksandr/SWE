package com.Task2;

/**
 * Ініціатор, який викликає дії при натисканні кнопок чи виборі пунктів меню.
 */
public class Invoker {

    private Action currentAction;

    /**
     * Призначає дію, яка буде виконуватись при натисканні.
     * @param action дія для виконання
     */
    public void setAction(Action action) {
        this.currentAction = action;
    }

    /**
     * Імітує натискання кнопки чи пункту меню.
     * Виконує поточну дію, якщо вона призначена.
     */
    public void pressButton() {
        if (currentAction != null) {
            currentAction.execute();
        } else {
            System.out.println("⚠️ Дію не призначено.");
        }
    }
}
