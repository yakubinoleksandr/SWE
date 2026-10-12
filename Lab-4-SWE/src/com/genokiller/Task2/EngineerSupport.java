package com.genokiller.Task2;

/**
 * Обробник запитів другого рівня — інженер підтримки.
 */
public class EngineerSupport implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 2) {
            System.out.println("Інженер підтримки обробляє запит: " + request.getDescription());
        } else if (nextHandler != null) {
            System.out.println("Інженер не може обробити \"" + request.getDescription() + "\" → передає далі...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит \"" + request.getDescription() + "\" не може бути оброблений.");
        }
    }
}
