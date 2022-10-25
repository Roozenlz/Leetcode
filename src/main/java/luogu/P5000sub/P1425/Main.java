package luogu.P5000sub.P1425;

import java.util.Scanner;

/** 小鱼的游泳时间
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        c -= a;
        if(d<b){
            c--;
            d = d+60-b;
        }else{
            d-=b;
        }
        System.out.println(c+" "+d);
    }
}
