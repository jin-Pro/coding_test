package Stage_11;

import java.util.Scanner;

public class No_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		int totalNum = 64;
		int min = totalNum;
		
		boolean[][] ches = new boolean[row][column];
		sc.nextLine();
		
		for(int i = 0; i < row; i++) {
			String color = sc.nextLine();
			String[] colors = color.split("");
			for(int j = 0; j < column; j++) {
				ches[i][j] = (colors[j].compareTo("B") == 0) ? false : true;
			}
		}
		
		boolean compareStart = true;
		boolean compare = compareStart;
		
		for(int i = 0; i < row - 7 ; i++) {
			
			for(int j = 0; j < column - 7; j++) {
				
				int count = 0;
				
				for(int k = i; k < i + 8; k++) {
					
					for(int z = j; z < j + 8; z++) {
						
						if(ches[k][z] != compare) {
							count++;
						}
						compare = !compare;
					}
					compareStart = !compareStart;
					compare = compareStart;
				}
				
				count = (count >totalNum/2) ? totalNum - count : count;
				min = (min > count) ? count : min;
			}
		}
		System.out.println(min);
	}
}
