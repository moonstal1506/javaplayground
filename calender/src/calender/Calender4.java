package calender;

import java.util.Scanner;

public class Calender4 {

	private static final int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int dayarr(int month) {
		return days[month - 1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݺ�Ƚ�� �Է�:");
		int times = scanner.nextInt();
		
		for(int i = 0;i<times;i++) {
			System.out.println("�� �Է� :");
			int month= scanner.nextInt();
			System.out.println(month+"�� :"+dayarr( month));
		}
		
		
//		int[] month= new int[times];
//		
//		for(int i=0;i<times;i++) {
//			month[i]=scanner.nextInt();
//		}
//		for(int i=0;i<times;i++) {
//			System.out.println(month[i]+"��"+dayarr(month[i]));
//		}
			

		scanner.close();
	}

}
