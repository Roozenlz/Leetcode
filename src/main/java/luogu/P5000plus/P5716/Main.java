package luogu.P5000plus.P5716;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		LocalDate localDate = LocalDate.of(year, month, 1);
		System.out.println(localDate.lengthOfMonth());
	}
}
