package gugudan;

import java.util.Scanner;

public class GugudanMain3 {

	public static void main(String[] args) {
		System.out.print("¸î´Ü?:");
		Scanner scanner= new Scanner(System.in);
		int num= scanner.nextInt();
		Gugudan3 gugu= new Gugudan3();
		int[] arr= gugu.cal(num);
		gugu.print(arr);
		
	}

}
