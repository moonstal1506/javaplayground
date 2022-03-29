package gugudan;

public class Gugudan3 {
	public static int[] cal(int num) {
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			
				arr[i]=num*(i+1);
			
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
