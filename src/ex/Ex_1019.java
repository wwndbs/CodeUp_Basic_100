package ex;

import java.util.Scanner;

public class Ex_1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		String arr[] = date.split("\\.");
		
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		System.out.printf("%04d.%02d.%02d", year, month, day);
	}
	  
}
