package com.genokiller.task1;

public class Main {
    public static void main(String[] args) {

        // Спроба створити кілька "екземплярів"
        GameManager gm1 = GameManager.getInstance();
        GameManager gm2 = GameManager.getInstance();
        GameManager gm3 = GameManager.getInstance();

        System.out.println("Перевірка Singleton:");
        System.out.println("gm1 == gm2 : " + (gm1 == gm2));
        System.out.println("gm2 == gm3 : " + (gm2 == gm3));
        System.out.println("Hash gm1 : " + gm1.hashCode());
        System.out.println("Hash gm2 : " + gm2.hashCode());
        System.out.println("Hash gm3 : " + gm3.hashCode());
        System.out.println();

        // Додавання фішок у гру
        gm1.addPiece(new GamePiece(1, 2, "Hero"));
        gm1.addPiece(new GamePiece(5, 3, "Enemy"));
        gm1.addPiece(new GamePiece(2, 7, "Treasure"));

        // Виведення поточного стану гри
        System.out.println("Поточний стан гри:");
        System.out.println("Опис простору: " + gm1.getGameSpace().getDescription());
        System.out.println("Список фішок:");
        for (GamePiece p : gm1.getPieces()) {
            System.out.println("- " + p.getType() +
                    " at (" + p.getX() + ", " + p.getY() + ")");
        }
        System.out.println();

        // Зміни через gm2 — повинні бути видні через gm1, gm3
        gm2.getGameSpace().setDescription("Updated world");
        gm2.addPiece(new GamePiece(9, 9, "Portal"));

        System.out.println("Перевірка спільності стану:");
        System.out.println("Опис простору через gm3: " + gm3.getGameSpace().getDescription());
        System.out.println("Кількість фішок через gm3: " + gm3.getPieces().size());

        System.out.println("\nПовний список фішок:");
        for (GamePiece p : gm3.getPieces()) {
            System.out.println("* " + p.getType() +
                    " at (" + p.getX() + ", " + p.getY() + ")");
        }
    }
}
