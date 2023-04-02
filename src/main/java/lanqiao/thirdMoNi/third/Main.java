package lanqiao.thirdMoNi.third;

import java.time.LocalDate;

/**
 * 问题描述
 * 　　对于一个日期，我们可以计算出年份的各个数位上的数字之和，也可以分别计算月和日的各位数字之和。请问从 1900 年 1 月 1 日至 9999 年 12 月 31 日，总共有多少天，年份的数位数字之和等于月的数位数字之和加日的数位数字之和。
 * 　　例如，2022年11月13日满足要求，因为 2+0+2+2=(1+1)+(1+3) 。
 * 　　请提交满足条件的日期的总数量。
 *
 * @author <a href="https://roozen.top">Roozen</a>
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        LocalDate date = LocalDate.of(1900, 1, 1);
        LocalDate deadline = LocalDate.of(9999, 12, 31);
        while (deadline.isAfter(date)) {
            if (test(date)) {
                sum++;
            }
            date = date.plusDays(1);
        }
        System.out.println(sum);
    }

    private static boolean test(LocalDate localDate) {
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int suma = year % 10 + year / 10 % 10 + year / 100 & 10 + year / 1000;
        int sumb = month % 10 + month / 10 % 10 + day % 10 + day / 10 % 10;
        if (suma == sumb) {
            return true;
        }
        return false;
    }
}
