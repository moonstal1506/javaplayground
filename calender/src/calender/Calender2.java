package calender;

import java.util.Scanner;

public class Calender2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ��� ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		System.out.println("�μ��� ����"+(first+second));
		System.out.printf("�μ��� ���� %d",first+second);
		scanner.close();
	}

}
