package CodeUp;

import java.util.Scanner;

public class No_70 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String answer = "";
		
		switch(num) {
		case 12:
		case 1:
		case 2:
			answer = "winter";
		break;
		case 3:
		case 4:
		case 5:
			answer = "spring";
		break;
		case 6:
		case 7:
		case 8:
			answer = "summer";
		break;
		case 9:
		case 10:
		case 11:
			answer = "fall";
		break;
		}
		
		System.out.println(answer);
	}
}
