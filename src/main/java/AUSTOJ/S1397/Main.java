package AUSTOJ.S1397;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                //可能会有空格
                String s = scanner.nextLine();
                System.out.println(s.replaceAll(scanner.nextLine(), ""));
            }
        } catch (Exception e) {

        }
    }
}
