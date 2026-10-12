package com.genokiller.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, який представляє акцію (об'єкт-спостережуваний).
 * Повідомляє всіх зареєстрованих спостерігачів про зміну своєї ціни.
 */
public class Stock {
    private String name;
    private double price;
    private List<StockObserver> observers;

    /**
     * Створює новий об'єкт акції.
     *
     * @param name  назва акції
     * @param price початкова ціна
     */
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    /** @return назва акції */
    public String getName() {
        return name;
    }

    /** @return поточна ціна акції */
    public double getPrice() {
        return price;
    }

    /**
     * Додає нового підписника.
     *
     * @param observer спостерігач, який підписується
     */
    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    /**
     * Видаляє підписника зі списку.
     *
     * @param observer спостерігач, якого потрібно відписати
     */
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    /**
     * Змінює ціну акції й автоматично сповіщає всіх підписників.
     *
     * @param newPrice нова ціна акції
     */
    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            this.price = newPrice;
            notifyObservers();
        }
    }

    /**
     * Сповіщає всіх зареєстрованих спостерігачів про зміну ціни.
     */
    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}
