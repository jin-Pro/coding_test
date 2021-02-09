package CodeUp;

import java.util.Scanner;

public class No_83 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.printf("1");
		for(int i = 2; i <= a; i++) {
			int num = i;
			if(((i % 10 == 0) && (i%3 == 0)) || (i%10 == 3) || (i % 10 == 6) || (i % 10 == 9)) {
				while(num != 0) {
					if((num%10 == 3) || (num % 10 == 6) || (num % 10 == 9)) {
						System.out.printf(" X");
					}
					num /= 10;
				}
			}else {
				System.out.printf(" %d",i);
			}
		}
	}
}
