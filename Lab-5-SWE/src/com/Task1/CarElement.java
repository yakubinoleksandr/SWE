package com.Task1;

/**
 * Інтерфейс для всіх елементів автомобіля.
 * Кожен елемент повинен приймати відвідувача.
 *
 * @see CarElementVisitor
 */
public interface CarElement {
    /**
     * Приймає об’єкт-відвідувач, який виконує дію над цим елементом.
     * @param visitor відвідувач
     */
    void accept(CarElementVisitor visitor);

    /**
     * Повертає назву елемента для звіту.
     * @return назва елемента
     */
    String getName();
}
