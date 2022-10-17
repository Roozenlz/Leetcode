package luogu.P5714;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal decimal1 = scanner.nextBigDecimal();
        BigDecimal decimal2 = scanner.nextBigDecimal();
        MathContext mathContext = new MathContext(6);
        BigDecimal divide = decimal1.divide(decimal2.pow(2),mathContext);
        if(divide.compareTo(new BigDecimal("18.5"))<0){
            System.out.println("Underweight");
        }else if(divide.compareTo(new BigDecimal("24"))<0){
            System.out.println("Normal");
        }else{
            System.out.println(divide);
            System.out.println("Overweight");
        }
    }
}
