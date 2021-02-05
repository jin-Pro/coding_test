package CodeUp;

import java.util.Scanner;

public class No_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		float num1 = Float.parseFloat(b[0]);
		float num2 = Float.parseFloat(b[1]);
		
		System.out.println((int)(num1/num2));
	}
}
