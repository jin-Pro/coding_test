package CodeUp;

import java.util.Scanner;

public class No_66 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a= sc.nextLine();
		String[] b = a.split(" ");
		
		int[] num = new int[3];
		num[0] = Integer.parseInt(b[0]);
		num[1] = Integer.parseInt(b[1]);
		num[2] = Integer.parseInt(b[2]);
		
		for(int i = 0; i<num.length; i++) {
			if(num[i] % 2 != 0) {
				System.out.println("odd");
			}else {
				System.out.println("even");
			}
		}
	}
}
