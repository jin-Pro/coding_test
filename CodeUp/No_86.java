package CodeUp;

import java.util.Scanner;

public class No_86 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		double num1 = Double.parseDouble(b[0]);
		double num2 = Double.parseDouble(b[1]);
		double num3 = Double.parseDouble(b[2]);
		
		double answer = num1 * num2 * num3  / 8 / 1024 / 1024;
		System.out.printf("%.2f MB",answer);
	}
}

