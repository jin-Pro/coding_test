package CodeUp;

import java.util.Scanner;

public class No_58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		
		int answer = (num1 == 0) ? ((num2 == 0) ? 1 : 0) : 0;
		System.out.println(answer);
	}
}
