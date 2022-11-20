package luogu.P5000plus.P5727;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        while (n != 1) {
            if ((n & 1) == 0) {
                n /= 2;
                stack.push(n);
            } else {
                n = n * 3 + 1;
                stack.push(n);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
