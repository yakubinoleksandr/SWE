package com.genokiller.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * GameManager є розпорядником гри та реалізує шаблон Singleton.
 * Він відповідає за:
 *  - зберігання ігрового простору;
 *  - управління списком ігрових фішок;
 *  - запуск та перезапуск гри;
 *  - надання глобальної точки доступу до стану гри.
 */
public class GameManager {

    private static GameManager instance;

    private GameSpace gameSpace;
    private final List<GamePiece> pieces;

    /**
     * Приватний конструктор блокує можливість створення екземплярів ззовні.
     */
    private GameManager() {
        this.gameSpace = new GameSpace("Default world");
        this.pieces = new ArrayList<>();
    }

    /**
     * Повертає єдиний екземпляр GameManager.
     *
     * @return примірник GameManager
     */
    public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    /**
     * Додає фішку в гру.
     *
     * @param piece ігрова фішка для додавання
     */
    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    /**
     * Видаляє фішку з гри.
     *
     * @param piece фішка, яку потрібно видалити
     */
    public void removePiece(GamePiece piece) {
        pieces.remove(piece);
    }

    /**
     * Оновлює стан усіх фішок.
     * У реальній грі тут би виконувалися логіка руху, взаємодії тощо.
     */
    public void updatePieces() {
        for (GamePiece p : pieces) {
            p.update();
        }
    }

    /**
     * Запускає або перезапускає гру.
     * Очищає список фішок і створює новий ігровий простір.
     */
    public void restartGame() {
        pieces.clear();
        this.gameSpace = new GameSpace("New world");
        System.out.println("Game restarted.");
    }

    /**
     * Повертає ігровий простір.
     *
     * @return GameSpace
     */
    public GameSpace getGameSpace() {
        return gameSpace;
    }

    /**
     * Повертає список ігрових фішок.
     *
     * @return список GamePiece
     */
    public List<GamePiece> getPieces() {
        return pieces;
    }
}

