package com.Task1;

/**
 * Демонстрація роботи патерну Visitor.
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        RepairVisitor repairVisitor = new RepairVisitor();

        car.accept(repairVisitor);

        System.out.println(repairVisitor.getReport());
        System.out.printf("Загальна вартість ремонту: %.2f грн\n", repairVisitor.getTotalCost());
        System.out.printf("Загальний час ремонту: %.2f год\n", repairVisitor.getTotalTime());
    }
}
