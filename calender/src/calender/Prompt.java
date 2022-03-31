package calender;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

	public void printMenu() {
		System.out
				.println("" + "+----------------------+\r\n" + "| 1. ���� ���           \r\n" + "| 2. ���� �˻�           \r\n"
						+ "| 3. �޷� ����\r\n" + "| h. ���� q. ����\r\n" + "+----------------------+\r\n");
	}

	public static int parseDay(String week) {

		switch (week) {
		case "su":
			return 0;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "wd":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		case "sa":
			return 6;
		default:
			return 0;
		}

	}

	private static final String PROMPT = "> ";

	public void runPrompt() throws ParseException {
		printMenu();
		Scanner scanner = new Scanner(System.in);
		Calender6 cal = new Calender6();

		boolean isLoop = true;
		while (isLoop) {
			System.out.println("��� (1, 2, 3, h, q)");

			String cmd = scanner.next();

			switch (cmd) {
			case "1":
				cmdRegister(scanner, cal);
				break;
			case "2":
				cmdSearch(scanner, cal);
				break;
			case "3":
				cmdCal(scanner, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				isLoop = false;

			}

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
		int year = scanner.nextInt();

		System.out.println("�� �Է� :");
		System.out.print(PROMPT);
		int month = scanner.nextInt();
		if (!(0 < month && month < 13))
			return;

		cal.printCal(year, month);

	}

	private void cmdSearch(Scanner scanner, Calender6 cal) {
		System.out.println("[�����˻�]");
		System.out.println("��¥ �Է� yyyy-mm-dd");
		String date = scanner.next();
		PlanItem planItem;

		planItem = cal.searchPlan(date);
		if(planItem !=null) {
			System.out.println(planItem.detail);
		}else {
			System.out.println("������ �����ϴ�.");
		}
	}


	public static void main(String[] args) throws ParseException {
		Prompt prompt = new Prompt();
		prompt.runPrompt();

	}

}
