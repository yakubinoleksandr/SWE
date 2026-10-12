package mkr;

public class LogModule implements EventListener {

    @Override
    public void update(String event) {
        System.out.println("[LOG] " + event);
    }
}

