package luogu.P5000sub.P1427;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        Stack<Integer> integers = new Stack<>();
        while ((n = scanner.nextInt()) != 0) {
            integers.push(n);
        }
        while (!integers.isEmpty()) {
            System.out.print(integers.pop() + " ");
        }
    }
}
