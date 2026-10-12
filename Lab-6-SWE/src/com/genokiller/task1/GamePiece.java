package com.genokiller.task1;

/**
 * GamePiece представляє окрему ігрову фішку:
 *  - позиція (x, y),
 *  - тип (наприклад, герой, ворог, предмет),
 *  - стан (активний/неактивний).
 */
public class GamePiece {

    private int x;
    private int y;
    private String type;
    private boolean active;

    /**
     * Створює нову ігрову фішку.
     *
     * @param x початкова координата X
     * @param y початкова координата Y
     * @param type тип фішки
     */
    public GamePiece(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.active = true;
    }

    /**
     * Оновлює стан фішки.
     * У реальних іграх тут би була поведінка персонажа.
     */
    public void update() {
        if (active) {
            System.out.println(type + " is updating at (" + x + ", " + y + ").");
        }
    }

    // Гетери та сетери

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() { return y; }

    public void setY(int y) { this.y = y; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
