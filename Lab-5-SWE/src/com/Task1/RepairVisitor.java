package com.Task1;

/**
 * Відвідувач, який виконує операцію ремонту автомобіля.
 * Обчислює загальну вартість, час і формує звіт.
 */
public class RepairVisitor implements CarElementVisitor{

    private double totalCost = 0;
    private double totalTime = 0;
    private final StringBuilder report = new StringBuilder();

    @Override
    public void visit(Engine engine) {
        report.append(engine.getName())
                .append(" — стан: ").append(engine.getCondition())
                .append(", вартість ремонту: ").append(engine.getRepairCost()).append(" грн, ")
                .append("час: ").append(engine.getRepairTime()).append(" год.\n");
        totalCost += engine.getRepairCost();
        totalTime += engine.getRepairTime();
    }

    @Override
    public void visit(Wheel wheel) {
        report.append(wheel.getName())
                .append(" — стан: ").append(wheel.getCondition())
                .append(", вартість ремонту: ").append(wheel.getRepairCost()).append(" грн, ")
                .append("час: ").append(wheel.getRepairTime()).append(" год.\n");
        totalCost += wheel.getRepairCost();
        totalTime += wheel.getRepairTime();
    }

    @Override
    public void visit(Body body) {
        report.append(body.getName())
                .append(" — стан: ").append(body.getCondition())
                .append(", вартість ремонту: ").append(body.getRepairCost()).append(" грн, ")
                .append("час: ").append(body.getRepairTime()).append(" год.\n");
        totalCost += body.getRepairCost();
        totalTime += body.getRepairTime();
    }

    @Override
    public void visit(Car car) {
        report.append("\n=== Звіт про ремонт автомобіля ===\n");
    }

    /**
     * @return загальна вартість ремонту автомобіля
     */
    public double getTotalCost() { return totalCost; }

    /**
     * @return загальний час ремонту автомобіля
     */
    public double getTotalTime() { return totalTime; }

    /**
     * @return текстовий звіт про стан елементів
     */
    public String getReport() { return report.toString(); }
}
