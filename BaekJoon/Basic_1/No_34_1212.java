package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_34_1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String answer = "";
		
		int len = input.length();
		String[] value = new String[8];
		value[0] = "000";
		value[1] = "001";
		value[2] = "010";
		value[3] = "011";
		value[4] = "100";
		value[5] = "101";
		value[6] = "110";
		value[7] = "111";
		
		for(int i = 0; i < len; i++) {
			int num = Integer.parseInt(Character.toString(input.charAt(i)));
			answer += value[num];
		}
		
		while(answer.charAt(0) == '0') {
			answer = answer.substring(1);
		}
		System.out.println(answer);
	}
}
