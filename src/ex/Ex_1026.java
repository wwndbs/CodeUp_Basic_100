package ex;

import java.util.Scanner;

public class Ex_1026 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String time = sc.nextLine();
			
			String[] arr = time.split(":");
			
			System.out.println(Integer.parseInt(arr[1]));
		}

}
