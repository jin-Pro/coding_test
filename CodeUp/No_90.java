package CodeUp;

import java.util.Scanner;

public class No_90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		long num1 = Long.parseLong(b[0]);
		long num2 = Long.parseLong(b[1]);
		long num3 = Long.parseLong(b[2]);
		
		num2 = (long) Math.pow(num2, num3-1);
		long answer = num1 * num2;
		System.out.println(answer);
	}
}
