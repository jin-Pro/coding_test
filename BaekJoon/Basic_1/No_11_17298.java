package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11_17298 {
	static String[] inputSplit ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String input = br.readLine();
		inputSplit = input.split(" ");
		
		solve(0,1);
		
		System.out.println(sb);
	}

	private static void solve(int i, int j) {
		// TODO Auto-generated method stub
		if(i == inputSplit.length-1) {
			sb.append(-1);
			return ;
		}
		if(j == inputSplit.length) {
			sb.append(-1).append(" ");
			solve(i+1,i+2);
			return;
		}
		int target = Integer.parseInt(inputSplit[i]);
		int compare = Integer.parseInt(inputSplit[j]);
		
		if(target < compare) {
			sb.append(compare).append(" ");
			solve(i+1,i+2);
		}else {
			solve(i,j+1);
		}
	}
}
