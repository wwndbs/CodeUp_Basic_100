package ex;

import java.util.Scanner;

public class Ex_1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		String[] arr = num.split("\\.");
		
		System.out.printf("%s\n%s", arr[0], arr[1]);
	}

}
