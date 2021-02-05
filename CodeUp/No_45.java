package CodeUp;

import java.util.Scanner;

public class No_45 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		String[] a = answer.split((" "));
		
		long num1 = Long.parseLong(a[0]);
		long num2 = Long.parseLong(a[1]);
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.printf("%.2f",(float)num1 / num2);
	}
}
