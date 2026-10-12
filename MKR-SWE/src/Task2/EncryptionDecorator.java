package Task2;

class EncryptionDecorator extends MessageDecorator {

    public EncryptionDecorator(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getText() {
        String plain = wrapped.getText();
        return shiftUkrainian(plain, 3);
    }

    // Простий зсув для українських літер
    private String shiftUkrainian(String text, int shift) {
        String alphabetLower = "абвгґдеєжзийіїклмнопрстуфхцчшщьюя";
        String alphabetUpper = alphabetLower.toUpperCase();

        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (alphabetLower.indexOf(c) != -1) {
                int pos = (alphabetLower.indexOf(c) + shift) % alphabetLower.length();
                sb.append(alphabetLower.charAt(pos));
            } else if (alphabetUpper.indexOf(c) != -1) {
                int pos = (alphabetUpper.indexOf(c) + shift) % alphabetUpper.length();
                sb.append(alphabetUpper.charAt(pos));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
