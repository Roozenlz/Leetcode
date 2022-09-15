package AUSTOJ.DSOJ.first.C;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>(Integer::compare);
        while (scanner.hasNext()) {
            set.add(scanner.nextInt());
            set.add(scanner.nextInt());
            set.add(scanner.nextInt());
            System.out.println(set.last());
            set.clear();
        }
    }
}


