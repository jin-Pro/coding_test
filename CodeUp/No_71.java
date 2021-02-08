package CodeUp;

import java.util.Scanner;

public class No_71 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		
		for(int i = 0; i < b.length; i++) {
			if(b[i].compareTo("0") ==0) {
				return ;
			}
			System.out.println(b[i]);
		}
	}

}
