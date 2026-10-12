package Task2;

class BaseMessage implements Message {
    private final String text;

    public BaseMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
