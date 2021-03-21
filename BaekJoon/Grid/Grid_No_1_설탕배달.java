package BaekJoon;

import java.util.Scanner;

public class Grid_No_1_¼³ÅÁ¹è´Þ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int weight = sc.nextInt();
		
		int firstWeight = 3;
		int secondWeight = 5;
		
		int first = 0;
		int second = 0;
		
		while(weight >= 0) {
			if(weight % secondWeight == 0) {
				second = weight / secondWeight ;
				System.out.println(first + second);
				return ;
			}
			
			first ++;
			weight -= firstWeight;
		}
		System.out.println(-1);
		return ;
	}
}
