package com.genokiller.Task2;

/**
 * Обробник запитів першого рівня — оператор служби підтримки.
 */
public class OperatorSupport implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getLevel() == 1) {
            System.out.println("Оператор підтримки обробляє запит: " + request.getDescription());
        } else if (nextHandler != null) {
            System.out.println("Оператор не може обробити \"" + request.getDescription() + "\" → передає далі...");
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Запит \"" + request.getDescription() + "\" не може бути оброблений.");
        }
    }
}
