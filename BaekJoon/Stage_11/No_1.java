package Stage_11;

import java.util.Scanner;

public class No_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cardNum = sc.nextInt();
		int totalNum = sc.nextInt();
		int[] card = new int[cardNum];
		
		int sum = 0;
		
		for(int i = 0; i < cardNum ; i++ ) {
			card[i] = sc.nextInt();
		}
		
		for(int i = 0; i < cardNum -2 ; i++) {
			for(int j = i+1; j < cardNum -1 ; j++) {
				for(int k = j+1; k < cardNum; k++) {
					if(card[i]+card[j]+card[k] <= totalNum) {
						sum = (card[i] + card[j] + card[k] > sum) ? card[i] + card[j] + card[k] : sum;
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
