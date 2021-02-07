package CodeUp;

import java.util.Scanner;

public class No_67 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int num = Integer.parseInt(a);
		
		if(num < 0) {
			System.out.println("minus");
		}else {
			System.out.println("plus");
		}
		
		if(num % 2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
