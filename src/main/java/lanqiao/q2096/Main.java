package lanqiao.q2096;

import java.util.Scanner;

/**
 * 小明特别喜欢顺子。顺子指的就是连续的三个数字：123、456 等。顺子日期指的就是在日期的 yyyymmdd 表示法中，存在任意连续的三位数是一个顺子的日期。
 * 例如 20220123 就是一个顺子日期，因为它出现了一个顺子：123； 而 20221023 则不是一个顺子日期，它一个顺子也没有。
 * 小明想知道在整个 2022 年份中，一共有多少个顺子日期?
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] strs = {"012", "123", "234", "345", "456", "567", "678", "789"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(2022);
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            stringBuilder.delete(4, stringBuilder.length());
            if (i < 10) {
                stringBuilder.append("0" + i);
            } else {
                stringBuilder.append(i);
            }
            for (int j = 1; j <= month[i - 1]; j++) {
                stringBuilder.delete(6, stringBuilder.length());
                if (j < 10) {
                    stringBuilder.append("0" + j);
                } else {
                    stringBuilder.append(j);
                }
                for (int k = 0; k < strs.length; k++) {
                    if (stringBuilder.toString().contains(strs[k])) {
                        System.out.println(stringBuilder.toString());
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
//        System.out.println(14);
        scan.close();
    }
}
