package CodeUp;

import java.util.Scanner;

public class No_84 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		int num3 = Integer.parseInt(b[2]);
		
		int count = 0;
		
		for(int i = 0; i<num1 ; i++) {
			for(int j = 0; j<num2 ; j++) {
				for(int k = 0; k<num3; k++) {
					System.out.printf("%d %d %d\n",i,j,k);
				}
			}
		}
		
		System.out.println(num1 * num2 * num3);
	}
}
