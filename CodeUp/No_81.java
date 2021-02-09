package CodeUp;

import java.util.Scanner;

public class No_81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a= sc.nextLine();
		String[] b = a.split(" ");
		int num1 = Integer.parseInt(b[0]);
		int num2 = Integer.parseInt(b[1]);
		
		for(int i = 1; i <= num1 ; i++) {
			for(int j = 1; j <= num2 ; j++) {
				System.out.printf("%d %d\n",i,j);
			}
		}
	}
}
