package lanqiao.q2120;

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String a = scan.next();
        int n = a.charAt(1) - '0';
        int l = 1189;
        int s = 841;
        for (int i = 0; i < n; i++) {
            int tmp = s;
            s = l / 2;
            l = tmp;
        }
        System.out.println(l);
        System.out.println(s);
        scan.close();
    }
}