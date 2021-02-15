package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int inputCount = Integer.parseInt(br.readLine());
		String[][] input = new String[inputCount][3];
		
		for(int i = 0; i < inputCount; i++) {
			String line = br.readLine();
			String[] lineSplit = line.split(" ");
			input[i][0] = lineSplit[0];
			input[i][1] = lineSplit[1];
			input[i][2] = String.valueOf(i);
		}
		
		Arrays.sort(input,new Comparator<String[]>() {

			@Override
			public int compare(String[] s1, String[] s2) {
				// TODO Auto-generated method stub
				if(s1[0] == s2[0]) {
					return Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]);
				}
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i = 0; i < inputCount; i++) {
			sb.append(input[i][0]).append(" ").append(input[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
