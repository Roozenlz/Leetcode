package luogu.P5000sub.P1055;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String replace = next.replace("-", "");
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (replace.charAt(i) - '0') * (i + 1);
        }
        int res = sum % 11;
        char flag;
        if (res == 10) {
            flag = 'X';
        } else {
            flag = (char) (res + '0');
        }
        if (flag == replace.charAt(9)) {
            System.out.println("Right");
        } else {
            System.out.println(next.substring(0, next.length() - 1) + flag);
        }
    }
}
