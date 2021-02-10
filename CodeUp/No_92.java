package CodeUp;

import java.util.Scanner;

public class No_92 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		int day = 1;
		
		int firstDay = Integer.parseInt(b[0]);
		int secondDay = Integer.parseInt(b[1]);
		int thirdDay = Integer.parseInt(b[2]);

		while((day % firstDay != 0)||(day % secondDay != 0)||(day % thirdDay != 0)) {
			day++;
		}
		System.out.println(day);
	}
}
