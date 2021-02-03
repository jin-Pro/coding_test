package CodeUp;

import java.util.Scanner;

public class No_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer = sc.nextLine();
		String[] a = answer.split(":");
		String[] b = {""};
		
		if(Integer.parseInt(a[1])<10) {
			b = a[1].split("");
			System.out.println(b[1]);
			return ;
		}
		System.out.println(a[1]);
	}
}
