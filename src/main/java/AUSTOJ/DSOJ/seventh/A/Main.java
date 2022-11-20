package AUSTOJ.DSOJ.seventh.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int opt, target;
            ArrayList<Integer> list = new ArrayList<>();
            while ((opt = scanner.nextInt()) != 0) {
                switch (opt) {
                    case 1:
                        int n = scanner.nextInt();
                        for (int i = 0; i < n; i++) {
                            list.add(scanner.nextInt());
                        }
                        for (int i = 0; i < n; i++) {
                            System.out.print(list.get(i) + " ");
                        }
                        System.out.println();
                        break;
                    case 2:
                        target = scanner.nextInt();
                        boolean flag = false;
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i) == target) {
                                flag = true;
                                System.out.println(i + 1);
                                break;
                            }
                        }
                        if (!flag) {
                            System.out.println(0);
                        }
                        break;
                    case 3:
                        Collections.sort(list);
                        target = scanner.nextInt();
                        int l = 0, r = list.size() - 1;
                        while (l <= r) {
                            int mid = (l + r) / 2;
                            if (list.get(mid) < target) {
                                l = mid + 1;
                            } else if (list.get(mid) > target) {
                                r = mid - 1;
                            } else {
                                System.out.println(mid + 1);
                                break;
                            }
                        }
                        if (l >= r) {
                            System.out.println(0);
                        }
                        break;
                }
            }
        } catch (Exception e) {
        }
    }
}
