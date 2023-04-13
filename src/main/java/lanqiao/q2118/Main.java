package lanqiao.q2118;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小蓝要把一个字符串中的字母按其在字母表中的顺序排列。
 * <p>
 * 例如，LANQIAO 排列后为 AAILNOQ。
 * <p>
 * 又如，GOODGOODSTUDYDAYDAYUP 排列后为 AADDDDDGGOOOOPSTUUYYY。
 * <p>
 * 请问对于以下字符串，排列之后字符串是什么？
 * <p>
 * WHERETHEREISAWILLTHEREISAWAY
 *
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String a = "WHERETHEREISAWILLTHEREISAWAY";
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        scan.close();
    }
}
