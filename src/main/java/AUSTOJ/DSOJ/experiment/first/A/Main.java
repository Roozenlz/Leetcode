package AUSTOJ.DSOJ.experiment.first.A;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Roozen
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<n;i++){
            list.add(scanner.nextInt());
        }
        int nextInt = scanner.nextInt();
        for (int i : list){
            System.out.println(i);
        }
        System.out.println(list.remove(nextInt-1));
        for (int i : list){
            System.out.println(i);
        }
        System.out.println(list.size());
    }
}
