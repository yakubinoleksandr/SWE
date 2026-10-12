package com.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Макродія — послідовність кількох дій, які виконуються як одна.
 */
public class MacroAction implements Action{

    private final List<Action> actions = new ArrayList<>();

    /**
     * Додає дію до макродії.
     * @param action дія для додавання
     */
    public void add(Action action) {
        actions.add(action);
    }

    @Override
    public void execute() {
        System.out.println("Виконання макро-дiї:");
        for (Action action : actions) {
            action.execute();
        }
        System.out.println("Макро-дiю завершено.\n");
    }
}
