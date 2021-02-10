package CodeUp;

import java.util.Scanner;

public class No_94 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalNum = sc.nextInt();
		sc.nextLine();
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		for(int i = b.length-1; i>=0 ; i--) {
			System.out.printf("%s ",b[i]);
		}
	}
}
