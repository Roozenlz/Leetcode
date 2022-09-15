package AUSTOJ.DSOJ.first.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 1, row = 1, col = 1; row <= n && col <= n; i++) {
            System.out.print(i + " ");
            if (row == col) {
                System.out.println();
                row++;
                col = 1;
            } else {
                col++;
            }
        }
    }
}
