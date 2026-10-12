package com.Task2;

/**
 * Конкретна дія: копіювання тексту.
 */
public class CopyAction implements Action{

    @Override
    public void execute() {
        System.out.println("Текст скопійовано у буфер.");
    }
}
