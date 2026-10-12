package com.genokiller.task1;

/**
 * GameSpace представляє ігровий простір, карту або поле.
 */
public class GameSpace {

    private String description;

    /**
     * Створює новий опис ігрового простору.
     *
     * @param description текстовий опис світу
     */
    public GameSpace(String description) {
        this.description = description;
    }

    /**
     * Повертає опис простору.
     *
     * @return опис
     */
    public String getDescription() {
        return description;
    }

    /**
     * Задає новий опис світу.
     *
     * @param description новий опис
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

