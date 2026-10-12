package mkr;

public class Main {

    public static void main(String[] args) {

        EventManager manager = EventManager.getInstance();

        LogModule log = new LogModule();
        UserInterface ui = new UserInterface();

        manager.subscribe(log);
        manager.subscribe(ui);

        AuthModule auth = new AuthModule();

        auth.login("Саша");
        auth.logout("Саша");
    }
}

