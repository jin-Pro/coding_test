package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_21_11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] dic = new String[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			dic[i] = input.substring(i);
		}
		
		Arrays.sort(dic);
		
		for(int i = 0; i < input.length(); i++) {
			System.out.println(dic[i]);
		}
	}
}
