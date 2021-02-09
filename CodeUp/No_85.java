package CodeUp;

import java.util.Scanner;

public class No_85 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		double num1 = Double.parseDouble(b[0]);
		double num2 = Double.parseDouble(b[1]);
		double num3 = Double.parseDouble(b[2]);
		double num4 = Double.parseDouble(b[3]);
		
		double answer = num1 * num2 * num3 * num4 / 8 / 1024 / 1024;
		System.out.printf("%.1f MB",answer);
	}
}
