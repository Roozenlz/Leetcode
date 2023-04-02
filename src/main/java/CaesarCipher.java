import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println("明码表: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        System.out.println("密码表: " + encrypt("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z", 2));
        Scanner scanner = new Scanner(System.in);
        System.out.print("明文：");
        String text = scanner.nextLine();
        System.out.println("密文：" + encrypt(text, 2));
    }

    public static String encrypt(String str, int offset) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                stringBuilder.append(c);
                continue;
            }
            if ((c & 1) == 0) {
                stringBuilder.append((char) ('A' + (c - 'A' + offset) % 26));
            } else {
                stringBuilder.append((char) ('A' + (c - 'A' + 3 * offset) % 26));
            }
        }
        return stringBuilder.toString();
    }
}
