package ex;

import java.util.Scanner;

public class Ex_1038 {

	public static void main(String[] args) {
		// 방법 1.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);
		
		System.out.println(a + b);
		
		// 방법 2.
		long c = sc.nextLong();
		long d = sc.nextLong();

		System.out.println(c + d);
	}

}
