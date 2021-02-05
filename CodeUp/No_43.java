package CodeUp;

import java.util.Scanner;

public class No_43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		
		System.out.println(num1 % num2);
		
	}
}
