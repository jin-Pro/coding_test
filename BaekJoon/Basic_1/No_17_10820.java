package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_17_10820 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		while(input.length() != 0) {
			
			int smallNum = 0;
			int bigNum = 0;
			int numNum = 0;
			int spaceNum = 0;
			
			for(int i = 0; i <input.length(); i++) {
				if(input.charAt(i) == ' ') spaceNum++;
				else if((int)input.charAt(i) >= (int)'0' && (int)input.charAt(i) <= (int)'9' ) numNum++;
				else if((int)input.charAt(i) >= (int)'a' && (int)input.charAt(i) <= (int)'z') smallNum++;
				else if((int)input.charAt(i) >= (int)'A' && (int)input.charAt(i) <= (int)'Z') bigNum++;
			}
			sb.append(smallNum).append(" ");
			sb.append(bigNum).append(" ");
			sb.append(numNum).append(" ");
			sb.append(spaceNum).append("\n");
			
			input = br.readLine();
		}
		System.out.println(sb);
	}
}
