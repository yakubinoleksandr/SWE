package Task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TimestampDecorator extends MessageDecorator {
    private final DateTimeFormatter formatter;

    public TimestampDecorator(Message wrapped) {
        this(wrapped, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public TimestampDecorator(Message wrapped, DateTimeFormatter formatter) {
        super(wrapped);
        this.formatter = formatter;
    }

    @Override
    public String getText() {
        String s = wrapped.getText();
        String now = LocalDateTime.now().format(formatter);
        return s + " [" + now + "]";
    }
}
