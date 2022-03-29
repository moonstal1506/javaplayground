package calender;

import java.util.Scanner;

public class Calender5 {

	private static final int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int dayarr(int month) {
		return days[month - 1];
	}

	public static void main(String[] args) {
		String prompt="cal> ";
		Scanner scanner = new Scanner(System.in);
		while(true) {

			System.out.println("�� �Է� :");
			System.out.print(prompt);
			int month= scanner.nextInt();
			if(month==-1) break ;
			if(!(0<month&&month<13)) continue;
			
			System.out.println(month+"�� :"+dayarr( month));
		}
		System.out.println("��");


		scanner.close();
	}

}
