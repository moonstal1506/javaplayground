package calender;

import java.util.Scanner;

public class Calender3 {
	private static final int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int dayarr(int month) {
		return days[month-1];
	}
	public int dayif(int month) {
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			return 31;
		}else if(month==2) {
			return 28;
		}else {
			return 30;
		}
	}
		
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calender3 cal= new Calender3();
		System.out.println("달 입력 ");
		int month = scanner.nextInt();
		System.out.println(month+"달"+cal.dayarr(month));
		System.out.println(month+"달"+cal.dayif(month));
		
		scanner.close();
	}

}
