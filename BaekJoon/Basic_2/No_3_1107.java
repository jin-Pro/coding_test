package Level_Basic_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_3_1107 {
	
	static int start = 100;
	static List<Integer> wrong = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int channel = scan.nextInt(), count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			wrong.add(scan.nextInt());				
		}
		
		int answer = Math.abs(channel - start);
		
		for(int i = 0; i <= 1000000; i++) {
			int length = check(i);
			if(length > 0) answer = Math.min(answer, Math.abs(channel - i) + length);
		}
		
		System.out.println(answer);
	}

	private static int check(int num) {
		// TODO Auto-generated method stub
		int length = 0;
		if(num == 0) return wrong.contains(num) ? 0 : 1;
		while(num>0) {
			if(wrong.contains(num % 10)) return 0;
		
			num /= 10;
			length ++;
		}
		
		return length;
	}
}
