package luogu.P5000plus.P5723;

import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = 2; ; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                sum += i;
                if (sum > L) {
                    System.out.println(--count);
                    break;
                } else {
                    System.out.println(i);
                }
            }
        }

        //筛选法求素数
//        boolean[] isNotPrime = new boolean[100001];
//        for (int i = 2; i <=100 ; i++) {
//            for (int j = 1; i*j <= 100000 ; j++) {
//                if (isNotPrime[i*j]) continue;
//                isNotPrime[i*j] = true;
//            }
//        }
//        System.out.println(Arrays.toString(isNotPrime));
//        int count = 0;
//        int sum=0;
//        for (int i = 2; i <=10000 ; i++) {
//            if(isNotPrime[i]) continue;
//            System.out.println(i);
//            count++;
//            sum+=i;
//            if(sum>L){
//                System.out.println(--count);
//                break;
//            }
//        }
    }
}
