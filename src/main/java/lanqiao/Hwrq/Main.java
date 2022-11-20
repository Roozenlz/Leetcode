package lanqiao.Hwrq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

/**
 * @author Roozen
 * @version 1.0
 */

public class Main {
    static boolean flag = false;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String date = scan.next();
        int day = Integer.parseInt(date);
        for (int d1 = 0; d1 <= 9; d1++) {
            for (int d2 = 0; d2 <= 9; d2++) {
                for (int d3 = 0; d3 <= 9; d3++) {
                    for (int d4 = 0; d4 <= 9; d4++) {
                        int d = d1 * 10000000 + d2 * 1000000 + d3 * 100000 + d4 * 10000 + d4 * 1000 + d3 * 100 + d2 * 10 + d1;
                        if (d <= day) {
                            continue;
                        }
                        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                        try {
                            //增加强判断条件，否则 诸如2022-02-29也可判断出去
                            format.setLenient(false);
                            Date dd = format.parse(d + "");
                            isPalindrome(d + "");
                        } catch (ParseException e) {
                            continue;
                        }
                    }
                }
            }
        }
        scan.close();
    }

    private static void isPalindrome(String n) {
        if (flag) {
            if (n.charAt(0) == n.charAt(2) && n.charAt(2) == n.charAt(5) && n.charAt(5) == n.charAt(7)
                    && n.charAt(1) == n.charAt(3) && n.charAt(3) == n.charAt(4) && n.charAt(4) == n.charAt(6)) {
                System.out.println(n);
                System.exit(0);
            }
            return;
        }
        for (int i = 0, j = n.length() - 1; i < j; i++, j--) {
            if (n.charAt(i) != n.charAt(j)) {
                return;
            }
        }
        System.out.println(n);
        flag = true;
        if (flag) {
            if (n.charAt(0) == n.charAt(2) && n.charAt(2) == n.charAt(5) && n.charAt(5) == n.charAt(7)
                    && n.charAt(1) == n.charAt(3) && n.charAt(3) == n.charAt(4) && n.charAt(4) == n.charAt(6)) {
                System.out.println(n);
                System.exit(0);
            }
            return;
        }
    }
}
