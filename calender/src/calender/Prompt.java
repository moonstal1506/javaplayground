package calender;

import java.util.Scanner;

public class Prompt {
	
	private static final String PROMPT="cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calender6 cal= new Calender6();
		
		while(true) {
			System.out.println("년 입력 :");
			System.out.print(PROMPT);
			int year= scanner.nextInt();

			System.out.println("달 입력 :");
			System.out.print(PROMPT);
			int month= scanner.nextInt();
			
			if(month==-1) break ;
			if(!(0<month&&month<13)) continue;
			cal.printCal(year, month);

		}
		System.out.println("끝");


		scanner.close();
	}
	
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();
		
	}

}
