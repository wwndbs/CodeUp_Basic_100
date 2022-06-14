package ex;

import java.util.Scanner;

public class Ex_1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int hex = Integer.valueOf(s, 16);
		
		System.out.printf("%o", hex);
	}

}
