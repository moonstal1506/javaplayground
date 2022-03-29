package gugudan;

import java.util.Scanner;

public class GugudanMain4 {

	public static void main(String[] args) {
		System.out.print("숫자 2개 입력 예)6,7");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		String[] arr= num.split(",");
		
		int first = Integer.parseInt(arr[0]);
		int second = Integer.parseInt(arr[1]);
		
		for(int i = 1; i<=second;i++) {
			System.out.println(first*i);
		}
		

	}

}
