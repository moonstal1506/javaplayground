package gugudan;

import java.util.Scanner;

public class GugudanMain2 {
	public static void main(String[] args) {
		Gugudan2 gugu= new Gugudan2();
		for(int i=2;i<10;i++) {
			System.out.println(i+"´Ü");
			int[] arr=gugu.cal(i);
			gugu.print(arr);
		}
	}
}

