package calender;

import java.util.Scanner;

public class Calender4 {

	private static final int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int dayarr(int month) {
		return days[month - 1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복횟수 입력:");
		int times = scanner.nextInt();
		
		for(int i = 0;i<times;i++) {
			System.out.println("달 입력 :");
			int month= scanner.nextInt();
			System.out.println(month+"달 :"+dayarr( month));
		}
		
		
//		int[] month= new int[times];
//		
//		for(int i=0;i<times;i++) {
//			month[i]=scanner.nextInt();
//		}
//		for(int i=0;i<times;i++) {
//			System.out.println(month[i]+"은"+dayarr(month[i]));
//		}
			

		scanner.close();
	}

}
