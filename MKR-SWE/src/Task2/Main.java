package Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Message base = new BaseMessage("  Привіт   світ!  Це   тестове    повідомлення.  ");

        System.out.println("Оригінал:");
        System.out.println(base.getText());
        System.out.println();

        Message compressed = new CompressionDecorator(base);
        System.out.println("Після стиснення:");
        System.out.println(compressed.getText());
        System.out.println();

        Message encryptedThen = new EncryptionDecorator(compressed);
        System.out.println("Після стиснення та шифрування (Caesar +3):");
        System.out.println(encryptedThen.getText());
        System.out.println();

        Message withTimestamp = new TimestampDecorator(encryptedThen);
        System.out.println("Після стиснення, шифрування і додавання мітки часу:");
        System.out.println(withTimestamp.getText());
        System.out.println();

        Message withAuthor = new AuthorDecorator(withTimestamp, "Якубін Олександр");
        System.out.println("Після стиснення, шифрування, мітки часу і ПІБ автора:");
        System.out.println(withAuthor.getText());
        System.out.println();

        Message encryptFirst = new EncryptionDecorator(base);
        System.out.println("Якщо спочатку зашифрувати (без стиснення):");
        System.out.println(encryptFirst.getText());
        System.out.println();

        Message compressAfterEncrypt = new CompressionDecorator(encryptFirst);
        System.out.println("Після шифрування, потім стиснення:");
        System.out.println(compressAfterEncrypt.getText());
        System.out.println();

        Message finalFlow = new AuthorDecorator(new TimestampDecorator(compressAfterEncrypt), "Якубін Олександр");
        System.out.println("Повний ланцюжок (шифрування → стиснення → мітка часу → ПІБ):");
        System.out.println(finalFlow.getText());
    }
}
