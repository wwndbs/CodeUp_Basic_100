package ex;

import java.util.Scanner;

public class Ex_1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		float c = (float)a / b;
		System.out.printf("%.2f", c);
	}

}
