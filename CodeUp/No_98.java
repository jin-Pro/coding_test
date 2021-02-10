package CodeUp;

import java.util.Scanner;

public class No_98 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[][] omok = new int[num1+1][num2+1];
		
		for(int i = 1; i <= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				omok[i][j] = 0;
			}
		}
		
		sc.nextLine();
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			int length = sc.nextInt();
			int direct = sc.nextInt();
			int col = sc.nextInt();
			int row = sc.nextInt();
			sc.nextLine();
			
			if(direct == 0) {
				for(int j = 0; j < length; j++) {
					omok[col][row+j] = 1;
				}
			}else {
				for(int j = 0; j < length; j++) {
					omok[col+j][row] = 1;
				}
			}
		}
		
		for(int i = 1; i<= num1; i++) {
			for(int j = 1; j <= num2; j++) {
				System.out.printf("%d ",omok[i][j]);
			}
			System.out.println();
		}
		
	}
}
