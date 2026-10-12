package mkr;

public class UserInterface implements EventListener {

    @Override
    public void update(String event) {
        System.out.println("[UI] Повідомлення користувачу: " + event);
    }
}

