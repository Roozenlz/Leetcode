package AUSTOJ.S1612;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i = 0; i < t; i++) {
            String num = in.next();
            int m = in.nextInt();
            LinkedList<Integer> l = new LinkedList<Integer>();
            Integer[] a = new Integer[num.length()];
            for (int j = 0; j < num.length(); j++) {
                a[j] = num.charAt(j) - '0';
                l.add(a[j]);
            }
            Arrays.sort(a, (o1, o2) -> o1.compareTo(o2));
            for (int j = 0; j < m; j++) {
                l.remove(a[j]);
            }
            int re = 0;
            Iterator<Integer> iterator = l.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                re = re * 10 + next;
            }
            System.out.println(re);
        }
    }
}
