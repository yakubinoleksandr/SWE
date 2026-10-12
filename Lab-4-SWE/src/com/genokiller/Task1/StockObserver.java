package com.genokiller.Task1;

/**
 * Інтерфейс спостерігача, який підписується на оновлення цін акцій.
 */
public interface StockObserver {
    /**
     * Викликається, коли ціна акції змінюється.
     *
     * @param stockName назва акції
     * @param newPrice  нове значення ціни
     */
    void update(String stockName, double newPrice);
}