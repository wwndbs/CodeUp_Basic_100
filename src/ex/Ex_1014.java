package ex;

import java.util.Scanner;

public class Ex_1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		
		String a = arr[0];
		String b = arr[1];
		
		System.out.println(b + " "	+ a);
	}
	
}
