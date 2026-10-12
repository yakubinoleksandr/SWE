package com.genokiller.Task1;

/**
 * Клас трейдера, який реагує на зміну цін акцій.
 */
public class Trader implements StockObserver {
    private String name;

    /**
     * @param name ім’я трейдера
     */
    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double newPrice) {
        System.out.println("Трейдер " + name + ": ціна " + stockName +
                " змінилась до " + newPrice + " USD. Аналізую можливість угоди...");
    }
}
