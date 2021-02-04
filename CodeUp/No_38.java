package CodeUp;

import java.util.Scanner;

public class No_38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		long[] num = new long[2];
		num[0] = Long.parseLong(arr[0]);
		num[1] = Long.parseLong(arr[1]);
		
		System.out.println(num[0] + num[1]);
	}
}
