package Stage_10;

import java.util.Scanner;

public class No_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int answer = factorial(num);
		System.out.println(answer);
	}
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num * (factorial(num -1));
	}
}
