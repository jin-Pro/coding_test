package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3_9012 {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			String[] inputSplit = input.split("");
			
			print(inputSplit);
		}
		
		System.out.println(sb);
	}
	
	public static void print(String[] input) {
		int left = 0;
		
		for(int j = 0; j < input.length; j++) {
			if(input[j].compareTo("(") == 0) {
				left ++;
			}
			if(input[j].compareTo(")") == 0) {
				left --;
			}
			if(left < 0 ) {
				sb.append("No").append("\n");
				return;
			}
		}
		
		if(left == 0) {
			sb.append("Yes").append("\n");
			
		}else {
			sb.append("No").append("\n");
		}
		return;
	}
}
