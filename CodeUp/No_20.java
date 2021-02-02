package CodeUp;

import java.util.Scanner;

public class No_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		String[] a = answer.split("\\-");
		String b = a[0] + a[1];
		
		System.out.println(b);
	}
}
