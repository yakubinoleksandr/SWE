package com.Task1;

/**
 * Клас, що моделює двигун автомобіля.
 */
public class Engine implements CarElement{

    private final String condition;
    private final double repairCost;
    private final double repairTime;

    /**
     * Створює двигун з вказаними параметрами.
     * @param condition стан двигуна
     * @param repairCost вартість ремонту
     * @param repairTime час ремонту (години)
     */
    public Engine(String condition, double repairCost, double repairTime) {
        this.condition = condition;
        this.repairCost = repairCost;
        this.repairTime = repairTime;
    }

    public String getCondition() { return condition; }
    public double getRepairCost() { return repairCost; }
    public double getRepairTime() { return repairTime; }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() { return "Двигун"; }
}
