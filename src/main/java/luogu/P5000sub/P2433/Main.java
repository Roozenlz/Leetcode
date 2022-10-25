package luogu.P5000sub.P2433;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                System.out.println(6 + " " + 4);
                break;
            case 3:
                System.out.println(3 + "\n" + 12 + "\n" + 2);
                break;
            case 4:
//                保留6位有效数字！！！！
                System.out.printf("%6.3f", 500.0 / 3);
                break;
            case 5:
                System.out.println(480 / (12 + 20));
                break;
            case 6:
                System.out.printf("%.4f",Math.sqrt(36 + 81));
                break;
            case 7:
                System.out.println(110);
                System.out.println(90);
                System.out.println(0);
                break;
            case 8:
                System.out.println(31.4159);
                System.out.println(78.5398);
                System.out.println(523.599);
                break;
            case 9:
                int a = 1;
                for (int i = 0; i < 3; i++) {
                    a = (a + 1) * 2;
                }
                System.out.println(a);
                break;
            case 10:
//                8< x< 10
                System.out.println(9);
                break;
            case 11:
                System.out.println(33.3333);
                break;
            case 12:
                System.out.println('M' - 'A' + 1);
                System.out.println((char) ('A' + 17));
                break;
            case 13:
                System.out.println((int) Math.pow(4.0 / 3 * 3.141593 * (64 + 1000),1.0/3));
                break;
            case 14:
                System.out.println(50);
                break;

        }
    }
}
