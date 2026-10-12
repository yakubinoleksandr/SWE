package mkr;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private final List<EventListener> listeners = new ArrayList<>();

    private EventManager() {}

    private static class Holder {
        private static final EventManager INSTANCE = new EventManager();
    }

    public static EventManager getInstance() {
        return Holder.INSTANCE;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void notifyEvent(String event) {
        for (EventListener listener : listeners) {
            listener.update(event);
        }
    }
}


