package Stage_11;

import java.util.Scanner;

public class No_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 665;
		
		int rank = 0;
		
		while(rank < num) {
			count++;
			if(String.valueOf(count).contains("666")) {
				rank ++;
			}
		}
		
		System.out.println(count);
	}
}
