package com.Task1;

/**
 * Інтерфейс відвідувача для всіх типів елементів автомобіля.
 * Реалізації цього інтерфейсу визначають різні операції над елементами.
 */
public interface CarElementVisitor {
    void visit(Engine engine);
    void visit(Wheel wheel);
    void visit(Body body);
    void visit(Car car);
}
