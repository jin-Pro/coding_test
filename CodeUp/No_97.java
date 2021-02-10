package CodeUp;

import java.util.Scanner;

public class No_97 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [][] omok = new String[20][20];
		
		for(int i = 1; i<20; i++) {
			String a = sc.nextLine();
			String[] b = a.split(" ");
			for(int j = 1; j<20; j++) {
				omok[i][j] = b[j-1];
			}
		}
		
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < num; i++) {
			String a = sc.nextLine();
			String[] b = a.split(" ");
			int num1 = Integer.parseInt(b[0]);
			int num2 = Integer.parseInt(b[1]);
			
			for(int j = 1; j < 20; j++) {
				if(omok[num1][j].compareTo("1") == 0) {
					omok[num1][j] = "0";
				}else {
					omok[num1][j] = "1";
				}
			}
			for(int k = 1; k < 20; k++) {
				if(omok[k][num2].compareTo("1") == 0) {
					omok[k][num2] ="0";
				}else {
					omok[k][num2] = "1";
				}
			}
		}
		
		for(int i = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				System.out.printf("%s ",omok[i][j]);
			}
			System.out.println();
		}
	}
}
