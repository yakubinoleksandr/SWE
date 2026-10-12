package com.genokiller.Task1;

/**
 * Головний клас, який демонструє роботу шаблону Observer.
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Stock apple = new Stock("AAPL", 190.0);
        Stock tesla = new Stock("TSLA", 250.0);

        Investor ivan = new Investor("Іван");
        Investor olena = new Investor("Олена");
        Trader petro = new Trader("Петро");
        AnalyticsSystem analytics = new AnalyticsSystem("FinAnalytics");

        apple.addObserver(ivan);
        apple.addObserver(analytics);
        tesla.addObserver(olena);
        tesla.addObserver(petro);
        tesla.addObserver(analytics);

        apple.setPrice(192.5);
        tesla.setPrice(260.0);
        tesla.setPrice(265.3);

        analytics.showHistory();
    }
}
