package CodeUp;

import java.util.Scanner;

public class No_79 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		for(int i = 0; i<b.length; i++) {
			if(b[i].compareTo("q") ==0) {
				System.out.println(b[i]);
				return;
			}
			System.out.println(b[i]);
		}
	}
}
