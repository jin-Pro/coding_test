package Level_Basic_1;

import java.util.Scanner;

public class No_23_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		int count = Math.min(first, second);
		int max = 0;
		int min = 0;
		
		for(int i = 1; i <= count; i++) {
			if(first % i == 0 && second % i == 0) {
				max = i;
			}
		}
		
		min = first * second / max;
		
		System.out.println(max);
		System.out.println(min);
	}
}
