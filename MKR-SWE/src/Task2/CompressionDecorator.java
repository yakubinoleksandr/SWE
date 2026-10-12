package Task2;

class CompressionDecorator extends MessageDecorator {

    public CompressionDecorator(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String s = wrapped.getText();
        // замінюємо послідовності пробілів (space, tab, newline) на один пробіл і обрізаємо
        String compact = s.replaceAll("\\s+", " ").trim();
        return compact;
    }
}
