package com.Task1;

/**
 * Клас, що описує колесо автомобіля.
 */
public class Wheel implements CarElement{

    private final String position;
    private final String condition;
    private final double repairCost;
    private final double repairTime;

    /**
     * Створює колесо.
     * @param position положення (переднє ліве тощо)
     * @param condition стан колеса
     * @param repairCost вартість ремонту
     * @param repairTime час ремонту (години)
     */
    public Wheel(String position, String condition, double repairCost, double repairTime) {
        this.position = position;
        this.condition = condition;
        this.repairCost = repairCost;
        this.repairTime = repairTime;
    }

    public String getPosition() { return position; }
    public String getCondition() { return condition; }
    public double getRepairCost() { return repairCost; }
    public double getRepairTime() { return repairTime; }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() { return "Колесо (" + position + ")"; }
}
