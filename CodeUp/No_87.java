package CodeUp;

import java.util.Scanner;

public class No_87 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i++;
			if(sum>= num) {
				break;
			}
		}
		System.out.println(sum);
	}
}
