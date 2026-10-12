package com.genokiller.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас аналітичної системи, яка зберігає історію цін.
 */
public class AnalyticsSystem implements StockObserver {
    private String systemName;
    private List<String> history;

    /**
     * @param systemName назва системи аналітики
     */
    public AnalyticsSystem(String systemName) {
        this.systemName = systemName;
        this.history = new ArrayList<>();
    }

    @Override
    public void update(String stockName, double newPrice) {
        String record = stockName + " = " + newPrice + " USD";
        history.add(record);
        System.out.println("Аналітична система " + systemName + ": збережено " + record);
    }

    /**
     * Виводить усю історію змін цін.
     */
    public void showHistory() {
        System.out.println("\nІсторія системи " + systemName + ":");
        for (String record : history) {
            System.out.println(" - " + record);
        }
    }
}
