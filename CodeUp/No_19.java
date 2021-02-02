package CodeUp;

import java.util.Scanner;

public class No_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		String[] a = answer.split("\\.");
		System.out.printf("%04d.%02d.%02d",Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2]));
	}
}
