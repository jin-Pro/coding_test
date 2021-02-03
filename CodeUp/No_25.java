package CodeUp;

import java.util.Scanner;

public class No_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		String[] a = answer.split("");
		
		for(int i = 0; i < a.length; i++) {
			int j = a.length - i - 1;
			String b ="";
			for (int k = 0; k<j; k++) {
				b += "0";
			}
			System.out.printf("[%s%s]\n",a[i],b);
		}
	}
}
