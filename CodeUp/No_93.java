package CodeUp;

import java.util.Scanner;

public class No_93 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalNum = sc.nextInt();
		sc.nextLine();
		String a = sc.nextLine();
		
		String[] b = a.split(" ");
		int[] answer = new int[24];
		
		for(int i = 0; i < b.length; i++) {
			int checkNum = Integer.parseInt(b[i]);
			answer[checkNum]++;
		}
		
		for(int i = 1; i< answer.length; i++) {
			System.out.printf("%d ",answer[i]);
		}
	}
}
