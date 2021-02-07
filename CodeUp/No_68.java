package CodeUp;

import java.util.Scanner;

public class No_68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		char answer;
		
		if(num >= 90) {
			answer = 'A';
		}else if(num >= 70) {
			answer = 'B';
		}else if(num >= 40) {
			answer = 'C';
		}else {
			answer = 'D';
		}
		
		System.out.println(answer);
		
		
	}
}
