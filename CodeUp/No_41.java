package CodeUp;

import java.util.Scanner;

public class No_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char answer = sc.nextLine().charAt(0);
		
		int a = (int)answer;
		
		char realAnswer = (char)(a+1);
		
		System.out.println(realAnswer);
	}
}
