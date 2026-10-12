package com.genokiller.Task2;

/**
 * Обробник запитів третього рівня — старший інженер підтримки.
 */
public class SeniorEngineerSupport implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 3) {
            System.out.println("Старший інженер підтримки обробляє запит: " + request.getDescription());
        } else if (nextHandler != null) {
            System.out.println("Старший інженер не може обробити \"" + request.getDescription() + "\" → передає далі...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит \"" + request.getDescription() + "\" не може бути оброблений.");
        }
    }
}
