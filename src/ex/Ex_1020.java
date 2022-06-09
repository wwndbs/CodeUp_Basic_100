package ex;

import java.util.Scanner;

public class Ex_1020 {

	public static void main(String[] args) {
		
		// 방법 1.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String arr[] = str.split("-");
		
		System.out.println(arr[0] + arr[1]);
		
		// 방법 2.
		String str2 = sc.nextLine();
		
		str2 = str2.replaceAll("-", "");
		
		System.out.println(str2);

	}

}
