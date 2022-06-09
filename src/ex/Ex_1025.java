package ex;

import java.util.Scanner;

public class Ex_1025 {

	public static void main(String[] args) {
		// 방법 1.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] iArr = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			iArr[i] = str.charAt(i) - '0' ;  // char - '0'을 이용하면 int형으로 변환이 가능하다. 
		}

		System.out.printf("[%d]\n[%d]\n[%d]\n[%d]\n[%d]\n", 
						   iArr[0]*10000, iArr[1]*1000, iArr[2]*100, iArr[3]*10, iArr[4]);
		
		// 방법 2.
		String str2 = sc.nextLine();
		
		String[] sArr = str2.split("");
		
		System.out.printf("[%d]\n", Integer.parseInt(sArr[0])*10000);
		System.out.printf("[%d]\n", Integer.parseInt(sArr[1])*1000);
		System.out.printf("[%d]\n", Integer.parseInt(sArr[2])*100);
		System.out.printf("[%d]\n", Integer.parseInt(sArr[3])*10);
		System.out.printf("[%d]\n", Integer.parseInt(sArr[4]));
		
		// 방법 3.
		String str3 = sc.nextLine();
		
		char[] cArr = str3.toCharArray();
		
		System.out.printf("[%c0000]\n", cArr[0]);
		System.out.printf("[%c000]\n", cArr[1]);
		System.out.printf("[%c00]\n", cArr[2]);
		System.out.printf("[%c0]\n", cArr[3]);
		System.out.printf("[%c]\n", cArr[4]);
		
		// 방법 4.
		int num = sc.nextInt();

		int num5 = (num / 10000) * 10000;
        int num4 = ((num / 1000) % 10) * 1000;
        int num3 = ((num / 100) % 10) * 100;
        int num2 = ((num / 10) % 10) * 10;
        int num1 = num % 10;
        
        System.out.println("[" + num5 + "]");
        System.out.println("[" + num4 + "]");
        System.out.println("[" + num3 + "]");
        System.out.println("[" + num2 + "]");
        System.out.println("[" + num1 + "]");
	}
	
}
