package ex;

import java.util.Scanner;

public class Ex_1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.println("'" + arr[i] + "'");
		}
	}

}

