package Stage_11;

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		int inputLength = answer.length();
		int inputNum = Integer.parseInt(answer);
		
		int startNum = inputNum - inputLength * 9;
		
		for(int i = startNum ; i<inputNum; i++) {
			int answerNum = i;
			int num = i;
			
			while(num > 0) {
				answerNum += (num % 10);
				num /= 10;
			}
			
			if(answerNum == inputNum) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
		return ;
	}
}
