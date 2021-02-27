package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_16_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		int[] count = new int[26];
		
		for(int i = 0; i < 26; i++) {
			count[i] = -1;
		}
		
		for(int i = 0; i < input.length(); i++) {
			int index = (int)input.charAt(i) - (int)'a';
			if(count[index] != -1) continue;
			count[index] = i;
		}
		
		for(int i = 0; i < 26; i++) {
			sb.append(count[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
