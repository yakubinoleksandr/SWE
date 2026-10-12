package com.genokiller.Task2;

/**
 * Демонстраційний клас, який показує роботу шаблону Chain of Responsibility.
 */
public class Main {
    /**
     * Точка входу в програму.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        Handler operator = new OperatorSupport();
        Handler engineer = new EngineerSupport();
        Handler senior = new SeniorEngineerSupport();

        operator.setNextHandler(engineer);
        engineer.setNextHandler(senior);

        SupportRequest req1 = new SupportRequest("Скидання пароля користувача", 1);
        SupportRequest req2 = new SupportRequest("Проблема з мережею", 2);
        SupportRequest req3 = new SupportRequest("Збій у базі даних", 3);
        SupportRequest req4 = new SupportRequest("Невідомий системний збій", 4);

        System.out.println("\n--- Обробка запитів ---");
        operator.handleRequest(req1);
        operator.handleRequest(req2);
        operator.handleRequest(req3);
        operator.handleRequest(req4);
    }
}
