package AUSTOJ.S1613;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            int count = 0;
            for (int i = 0; i < c1.length; i++) {
                if (c1[i] != c2[i]) {
                    if (c1[i] != c1[i + 1]) {
                        c1[i + 1] = c1[i];
                    } else {
                        c1[i + 1] = c2[i];
                    }
                    c1[i] = c2[i];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
