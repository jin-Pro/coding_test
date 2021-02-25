package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2_9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			String[] inputSplit = input.split(" ");
			
			for(int j = 0; j < inputSplit.length; j++) {
				String[] inputChar = inputSplit[j].split("");
				
				for(int k = inputChar.length-1; k >= 0; k--) {
					sb.append(inputChar[k]);
				}
				
				sb.append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
