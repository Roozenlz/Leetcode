package luogu.P5000plus.P5705;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** P5707 【深基2.例12】上学迟到
 * @author Roozen
 * @version 1.0
 */
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime lt = LocalTime.of(8,0);
        System.out.println(dtf.format(lt.minusMinutes((long)Math.ceil(s.nextDouble()/s.nextDouble()+10))));
    }
}