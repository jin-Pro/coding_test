package Stage_10;

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int answer = Fibbo(num);
		
		System.out.println(answer);
	}
	
	public static int Fibbo(int num) {
		if(num == 0) {
			return 0;
		}
		if(num == 1) {
			return 1;
		}
		
		return(Fibbo(num - 1) + Fibbo(num -2));
	}
}
