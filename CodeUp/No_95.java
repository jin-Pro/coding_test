package CodeUp;

import java.util.Scanner;

public class No_95 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int totalNum = Integer.parseInt(a);
		String b = sc.nextLine();
		String[] c = b.split(" ");
		int temp = 9999;
		
		for(int i = 0; i<c.length; i++) {
			int num = Integer.parseInt(c[i]);
			if(temp > num) {
				temp = num;
			}
		}
		
		System.out.println(temp);
	}
}
