package calender;

import java.util.Scanner;

public class Calender6 {

	private static final String PROMPT = "cal> ";

	private static final int[] DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] YDAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static boolean isyday(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int day(int year, int month) {
		if(isyday(year)) {
			return YDAYS[month - 1];
		}
		return DAYS[month - 1];
	}

	public void printCal(int year, int month) {
		int maxday = day(year,month);
		System.out.printf("%4d³â %3d¿ù\n", year, month);
		System.out.printf(" su mo tu we th fr sa");
		System.out.println();
		System.out.println("--------------------");
		for (int i = 1; i <= maxday; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
}