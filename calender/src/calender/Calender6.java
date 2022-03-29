package calender;

import java.util.Scanner;

public class Calender6 {
	
	private static final String PROMPT="cal> ";

	private static final int[] DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int day(int month) {
		return DAYS[month - 1];
	}
	public void printCal(int year, int month) {
		int maxday=day(month);
		System.out.printf("%4d³â %3d¿ù\n",year,month);
		System.out.printf(" su mo tu we th fr sa");
		System.out.println();
		System.out.println("--------------------");
		for(int i=1;i<=maxday;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) System.out.println();
		}
		System.out.println();
	}
}	