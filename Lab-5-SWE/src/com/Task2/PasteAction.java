package com.Task2;

/**
 * Конкретна дія: вставлення тексту.
 */
public class PasteAction implements Action{

    @Override
    public void execute() {
        System.out.println("Текст вставлено.");
    }
}
