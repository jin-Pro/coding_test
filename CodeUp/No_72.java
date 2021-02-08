package CodeUp;

import java.util.Scanner;

public class No_72 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] number = new int[num];
		for(int i = 0; i < num ; i++) {
			number[i] = sc.nextInt();
		}
		for(int i = 0; i < num; i++) {
			System.out.println(number[i]);
		}
	}
}
