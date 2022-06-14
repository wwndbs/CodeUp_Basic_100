package ex;

import java.util.Scanner;

public class Ex_1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int octal = Integer.valueOf(s, 8);
		
		System.out.printf("%d", octal);
	}

}
