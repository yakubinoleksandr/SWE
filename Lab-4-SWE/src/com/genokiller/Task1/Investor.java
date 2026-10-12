package com.genokiller.Task1;

/**
 * Клас інвестора, який реагує на зміну цін акцій.
 */
public class Investor implements StockObserver {
    private String name;

    /**
     * @param name ім’я інвестора
     */
    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Інвестор " + name + " отримав оновлення: " +
                stockName + " = " + newPrice + " USD");
    }
}