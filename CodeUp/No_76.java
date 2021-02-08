package CodeUp;

import java.util.Scanner;

public class No_76 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char answer = sc.nextLine().charAt(0);
		
		int firstNum = (int)'a';
		int lastNum = (int)answer;
		
		for(int i = firstNum ; i <= lastNum; i++) {
			System.out.printf("%c ",(char)i);
		}
		
	}
}
