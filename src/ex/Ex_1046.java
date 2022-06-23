package ex;

import java.util.Scanner;

public class Ex_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		System.out.println(a + b + c);
		
		float avg = (float)(a + b + c) / 3;
		System.out.printf("%.1f", avg);
	}

}
