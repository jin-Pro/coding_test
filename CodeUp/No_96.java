package CodeUp;

import java.util.Scanner;

public class No_96 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		sc.nextLine();
		
		int[][] omok = new int[20][20];
		
		for(int i = 0; i < count ; i++) {
			String a =sc.nextLine();
			String[] b = a.split(" ");
			int num1 = Integer.parseInt(b[0]);
			int num2 = Integer.parseInt(b[1]);
			
			omok[num1][num2] = 1;
		}
		
		for(int i = 1; i<=19; i++) {
			for(int j = 1; j<=19; j++) {
				System.out.printf("%d ",omok[i][j]);
			}
			System.out.println();
		}
	}
}
