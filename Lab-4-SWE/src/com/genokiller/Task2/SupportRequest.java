package com.genokiller.Task2;

/**
 * Клас, який представляє запит на технічну підтримку.
 */
public class SupportRequest {
    private String description;
    private int level; // 1 – простий, 2 – середній, 3 – складний

    /**
     * Створює новий запит.
     *
     * @param description опис проблеми
     * @param level       рівень складності
     */
    public SupportRequest(String description, int level) {
        this.description = description;
        this.level = level;
    }

    /** @return опис запиту */
    public String getDescription() {
        return description;
    }

    /** @return рівень складності запиту */
    public int getLevel() {
        return level;
    }
}
