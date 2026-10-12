package Task2;

abstract class MessageDecorator implements Message {
    protected final Message wrapped;

    public MessageDecorator(Message wrapped) {
        this.wrapped = wrapped;
    }
}
