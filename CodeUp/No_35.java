package CodeUp;

import java.util.Scanner;

public class No_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int b = Integer.valueOf(a, 16);
		System.out.printf("%o",b);
	}
}
