package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_19_11655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String answer = "";
		for(int i = 0; i < input.length(); i++) {
			if(((int)input.charAt(i) >= (int)'a' && (int)input.charAt(i) <= (int)'z') ||
					((int)input.charAt(i) >= (int)'A' && (int)input.charAt(i) <= (int)'Z')) {
				
				int num = (int)(input.charAt(i) + 13);
				
				if(num > (int)'Z' && num < (int)'m' ) {
					answer += (char)(num - (int)'Z' + (int)'A' -1);
				}else if(num > (int)'z') {
					answer += (char)(num - (int)'z' + (int)'a' -1);
				}else {
					answer += (char)num;
				}
			}else {
				answer += input.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
