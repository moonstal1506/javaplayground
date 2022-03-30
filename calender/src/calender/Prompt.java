package calender;

import java.util.Scanner;

public class Prompt {
	
	public static int numDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("wd")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;
	}

	
	private static final String PROMPT="cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender6 cal= new Calender6();
		
		while(true) {
			System.out.println("년 입력 :");
			System.out.print(PROMPT);
			int year= scanner.nextInt();
			if(year==-1) break ;

			System.out.println("달 입력 :");
			System.out.print(PROMPT);
			int month= scanner.nextInt();
			if(!(0<month&&month<13)) continue;
			
			System.out.println("첫번째 요일 입력 :su,mo,tu,wd,th,fr,sa");
			System.out.print(PROMPT);
			String week= scanner.next();
			int numDay=numDay(week);
			
			cal.printCal(year, month, numDay);

		}
		System.out.println("끝");


		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();
		
	}

}
