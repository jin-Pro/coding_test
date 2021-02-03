package CodeUp;

import java.util.Scanner;

public class No_23 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String answer = sc.nextLine();
			
			String[] a = answer.split("\\.");
			
			System.out.println(a[0]);

			System.out.println(a[1]);
		}
}
