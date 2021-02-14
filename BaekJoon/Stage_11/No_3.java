package Stage_11;

import java.util.Scanner;

public class No_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleNum = sc.nextInt();
		
		int[][] weight = new int[peopleNum][2];
		
		for(int i = 0; i < peopleNum; i++) {
			weight[i][0] = sc.nextInt();
			weight[i][1] = sc.nextInt();
		}
		
		
		for(int i = 0; i< peopleNum; i++) {
			int rank = 1;
			for(int j = 0; j < peopleNum; j++) {
				if(i == j) {
					continue;
				}
				if((weight[i][0] < weight[j][0]) && (weight[i][1] < weight[j][1])){
					rank ++;
				}
				
			}
			System.out.printf("%d ",rank);
		}
	}
}
