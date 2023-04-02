package lanqiao.thirdMoNi.four;

/**
 * 问题描述
 * 　　小蓝有 30 个数，分别为：99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77 。
 * 　　小蓝可以在这些数中取出两个序号不同的数，共有 30*29/2=435 种取法。
 * 　　请问这 435 种取法中，有多少种取法取出的两个数的乘积大于等于 2022 。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18, 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77};
//        System.out.println(arr.length);
        int sum = 0;
        int a = 0;
        for (int i = 0; i < 29; i++) {
            for (int j = i + 1; j < 30; j++) {
                if (arr[i] * arr[j] >= 2022) {
                    sum++;
                }
                a++;
            }
        }
        System.out.println(sum);
        System.out.println(a);
    }
}
