package com.Task2;

/**
 * Конкретна дія: відкриття файлу.
 */
public class OpenFileAction implements Action{

    @Override
    public void execute() {
        System.out.println("Файл відкрито.");
    }
}
