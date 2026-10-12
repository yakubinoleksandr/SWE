package Task2;

class AuthorDecorator extends MessageDecorator {
    private final String authorFullName;

    public AuthorDecorator(Message wrapped, String authorFullName) {
        super(wrapped);
        this.authorFullName = authorFullName;
    }

    @Override
    public String getText() {
        String s = wrapped.getText();
        return s + " — " + authorFullName;
    }
}
