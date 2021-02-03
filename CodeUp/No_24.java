package CodeUp;

import java.util.Scanner;

public class No_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		
		String[] a = answer.split("");
		
		for(int i = 0; i<a.length; i++) {
			System.out.printf("'%s'\n",a[i]);
		}
	}
}
