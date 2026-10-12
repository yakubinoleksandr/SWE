package com.Task2;

/**
 * Демонстрація роботи патерну Command.
 */
public class Main {

    public static void main(String[] args) {

        //Створення дій
        Action save = new SaveFileAction();
        Action open = new OpenFileAction();
        Action copy = new CopyAction();
        Action paste = new PasteAction();

        // Ініціатор (наприклад, кнопка або пункт меню)
        Invoker toolbarButton = new Invoker();

        // --- Демонстрація 1: динамічна зміна дій ---
        toolbarButton.setAction(open);
        toolbarButton.pressButton();

        toolbarButton.setAction(save);
        toolbarButton.pressButton();

        toolbarButton.setAction(copy);
        toolbarButton.pressButton();

        toolbarButton.setAction(paste);
        toolbarButton.pressButton();

        // --- Демонстрація 2: макродія ---
        MacroAction macro = new MacroAction();
        macro.add(open);
        macro.add(copy);
        macro.add(paste);
        macro.add(save);

        toolbarButton.setAction(macro);
        toolbarButton.pressButton();
    }
}
