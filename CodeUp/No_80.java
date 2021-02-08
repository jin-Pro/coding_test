package CodeUp;

import java.util.Scanner;

public class No_80 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while(true) {
			sum += i;
			if(sum >= num) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}
