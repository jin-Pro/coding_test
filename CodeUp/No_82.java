package CodeUp;

import java.util.Scanner;

public class No_82 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int b = Integer.valueOf(a, 16);
		
		for(int i = 1; i < 16; i++) {
			
			int num = b*i;
			String gop = Integer.toHexString(i);
			String realGop = gop.toUpperCase();
			
			String answer = Integer.toHexString(num);
			String realAnswer = answer.toUpperCase();
			
			System.out.printf("%s*%s=%s\n",a,realGop,realAnswer);
		}
	}
}
