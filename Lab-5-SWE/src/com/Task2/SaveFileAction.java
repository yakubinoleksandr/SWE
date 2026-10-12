package com.Task2;

/**
 * Конкретна дія: збереження файлу.
 */
public class SaveFileAction implements Action{

    @Override
    public void execute() {
        System.out.println("Файл збережено.");
    }
}
