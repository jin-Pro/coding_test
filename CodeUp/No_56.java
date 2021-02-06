package CodeUp;

import java.util.Scanner;

public class No_56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		
		int answer = (num1 != num2)?1:0;
		
		System.out.println(answer);
	}
}
