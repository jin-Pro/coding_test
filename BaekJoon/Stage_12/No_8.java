package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int inputCount = Integer.parseInt(br.readLine());
	
		String[] input = new String[inputCount];
		
		for(int i = 0; i < inputCount ; i++) {
			input[i] = br.readLine();
		}
		
		Arrays.sort(input,new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				if(s1.length() == s2.length()) {
					int i = 0;
					while(i < s1.length()-1) {
						if(s1.charAt(i) != s2.charAt(i)) {
							return s1.charAt(i) - s2.charAt(i);							
						}
						i++;
					}
					return s1.charAt(i) - s2.charAt(i);
				}
				return s1.length() - s2.length();
			}
			
		});
		
		for(int i = 0; i < inputCount - 1 ; i++) {
			if(input[i].compareTo(input[i+1]) == 0) {
				continue;
			}
			sb.append(input[i]).append("\n");
		}
		sb.append(input[inputCount-1]);
		
		System.out.println(sb);
	}
}
