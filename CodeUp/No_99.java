package CodeUp;

import java.util.Scanner;

public class No_99 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] omok = new int[11][11];
		
		int startCol = 2;
		int startRow = 2;
		
		int currentCol = startCol;
		int currentRow = startRow;
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j < 10; j++) {
				omok[i+1][j+1] = sc.nextInt();
			}
		}
		
		while(omok[currentCol][currentRow] != 2) {
			omok[currentCol][currentRow] = 9;
			
			if((omok[currentCol][currentRow+1] == 1)&&(omok[currentCol+1][currentRow] == 1)) {
				break;
			}
			if(omok[currentCol][currentRow+1] == 1) {
				currentCol ++;
			}else {
				currentRow ++;
			}
		}
		
		if(omok[currentCol][currentRow] ==2) {			
			omok[currentCol][currentRow] = 9;
		}
		
		for(int i = 1; i<11; i++) {
			for(int j = 1; j<11; j++) {
				System.out.printf("%d ",omok[i][j]);
			}
			System.out.println();
		}
	}
}
