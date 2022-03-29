package calender;

import java.util.Scanner;

public class Calender2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요 ");
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		System.out.println("두수의 합은"+(first+second));
		System.out.printf("두수의 합은 %d",first+second);
		scanner.close();
	}

}
