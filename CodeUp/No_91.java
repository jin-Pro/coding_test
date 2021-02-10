package CodeUp;

import java.util.Scanner;

public class No_91 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		
		String[] b = a.split(" ");
		
		long firstNum = Long.parseLong(b[0]);
		long multiNum = Long.parseLong(b[1]);
		long addNum = Long.parseLong(b[2]);
		long count = Long.parseLong(b[3]);
		
		for(int i = 0; i < count -1 ; i++) {
			firstNum = firstNum * multiNum + addNum;
		}
		
		System.out.println(firstNum);
		
		
	}
}
