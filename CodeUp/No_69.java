package CodeUp;

import java.util.Scanner;

public class No_69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		char b = a.charAt(0);
		String answer ;
		
		switch(b) {
		case 'A':
			answer = "best!!!";
			break;
		case 'B':
			answer = "good!!";
			break;
		case 'C':
			answer = "run!";
			break;
		case 'D':
			answer = "slowly~";
			break;
		default:
			answer = "what?";
			break;
		}
		System.out.println(answer);
	}
}
