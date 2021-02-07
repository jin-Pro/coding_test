package CodeUp;

import java.util.Scanner;

public class No_65 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		int[] c = new int[3];
		c[0] = Integer.parseInt(b[0]);		
		c[1] = Integer.parseInt(b[1]);
		c[2] = Integer.parseInt(b[2]);
		
		for(int i = 0 ; i < c.length; i++) {
			if(c[i] %2 == 0) {
				System.out.println(c[i]);
			}
		}
	}
}
