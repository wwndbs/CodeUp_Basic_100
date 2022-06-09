package ex;

import java.util.Scanner;

public class Ex_1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bday = sc.nextLine();
		
		String[] arr = bday.split("\\.");
		
		System.out.printf("%02d-%02d-%04d", Integer.parseInt(arr[2]), Integer.parseInt(arr[1]), Integer.parseInt(arr[0]));
	}

}
