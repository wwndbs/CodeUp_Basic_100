package ex;

import java.util.Scanner;

public class Ex_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = str.split(":");
		
		String h = arr[0];
		String m = arr[1];
		
		System.out.printf("%s:%s", h, m);
	}

}
