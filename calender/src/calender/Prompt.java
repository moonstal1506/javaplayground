package calender;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	
	public void printMenu() {
		System.out.println(""
				+ "+----------------------+\r\n" + 
				"| 1. ���� ���           \r\n" + 
				"| 2. ���� �˻�           \r\n" + 
				"| 3. �޷� ����\r\n" + 
				"| h. ���� q. ����\r\n" + 
				"+----------------------+\r\n" 
				);
	}
	
	public static int parseDay(String week) {
		if(week.equals("su")) return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("wd")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;
	}

	
	private static final String PROMPT="> ";

	public void runPrompt() throws ParseException {
		printMenu();
		Scanner scanner = new Scanner(System.in);
		Calender6 cal= new Calender6();
		
		while(true) {
			System.out.println("��� (1, 2, 3, h, q)");
			
			String cmd=scanner.next();
			if(cmd.equals("1")) cmdRegister(scanner,cal);
			else if(cmd.equals("2")) cmdSearch(scanner,cal);
			else if(cmd.equals("3")) cmdCal(scanner,cal);
			else if(cmd.equals("h")) printMenu();
			else if(cmd.equals("q")) break;
			


		}
		System.out.println("��");
		scanner.close();
	}
	
	private void cmdRegister(Scanner scanner, Calender6 cal) throws ParseException {
        System.out.println("[�� ���� ���]");
        System.out.println("��¥�� �Է��� �ּ��� (yyyy-MM-dd).");
        String date = scanner.next();
        String text = "";
        scanner.nextLine(); 
        System.out.println("������ �Է��� �ּ���.");
        text = scanner.nextLine();

        cal.registerPlan(date, text);
    }

	private void cmdCal(Scanner scanner, Calender6 cal) {
		System.out.println("�� �Է� :");
		System.out.print(PROMPT);
		int year= scanner.nextInt();

		System.out.println("�� �Է� :");
		System.out.print(PROMPT);
		int month= scanner.nextInt();
		if(!(0<month&&month<13)) return;
		
		cal.printCal(year, month);
		
	}

	private void cmdSearch(Scanner scanner, Calender6 cal) {
		System.out.println("[�����˻�]");	
		System.out.println("��¥ �Է� yyyy-mm-dd");
		String date = scanner.next();
		String plan="";
		try {
			plan = cal.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("���� �˻� ����");
		}
		System.out.println(plan);
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws ParseException {
		Prompt prompt = new Prompt();
		prompt.runPrompt();
		
	}

}
