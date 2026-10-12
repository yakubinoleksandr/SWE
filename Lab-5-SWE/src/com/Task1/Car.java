package com.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє автомобіль як композицію з кількох елементів.
 * Може містити двигун, колеса, кузов тощо.
 */
public class Car implements CarElement{

    private final List<CarElement> elements = new ArrayList<>();

    /** Створює автомобіль із типових компонентів. */
    public Car() {
        elements.add(new Engine("Пошкоджений", 15000, 8));
        elements.add(new Wheel("Переднє ліве", "Зношене", 1000, 1));
        elements.add(new Wheel("Переднє праве", "Зношене", 1000, 1));
        elements.add(new Wheel("Заднє ліве", "Прокол", 800, 1.5));
        elements.add(new Wheel("Заднє праве", "Добрий", 0, 0));
        elements.add(new Body("Подряпини", 3000, 2.5));
    }

    public List<CarElement> getElements() {
        return elements;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
        for (CarElement e : elements)
            e.accept(visitor);
    }

    @Override
    public String getName() { return "Автомобіль"; }
}
