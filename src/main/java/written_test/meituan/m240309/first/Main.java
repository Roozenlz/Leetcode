package written_test.meituan.m240309.first;

import java.util.Scanner;

/**
 * @description: 文件描述
 * @author： <a href="https://roozen.top">Roozen</a>
 * @date: 2024/3/23
 * @Copyright： 博客：https://roozen.top
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int result = 0;
        for (char c : s.toCharArray()) {
            if(c=='M' || c=='T'){
                result++;
            }else if(k>0){
                k--;
                result++;
            }else{
                break;
            }
        }
        System.out.println(result);

    }
}
