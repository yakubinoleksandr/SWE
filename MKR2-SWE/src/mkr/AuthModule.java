package mkr;

public class AuthModule {

    public void login(String user) {
        String event = "AuthModule: користувач " + user + " авторизувався";
        EventManager.getInstance().notifyEvent(event);
    }

    public void logout(String user) {
        String event = "AuthModule: користувач " + user + " вийшов";
        EventManager.getInstance().notifyEvent(event);
    }
}


