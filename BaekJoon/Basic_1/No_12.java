package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_12 {
	static StringBuilder sb = new StringBuilder();
	static int[] num ;
	static int[] count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		num = new int[inputSplit.length];
		int max = -1;
		
		for(int i = 0; i < inputSplit.length; i++) {
			num[i] = Integer.parseInt(inputSplit[i]);
			max = max > num[i] ? max : num[i];
		}
		count = new int[max+1];
		
		for(int i = 0; i < num.length; i++) {
			count[num[i]] ++;
		}
		
		solve(0,1);
		
		System.out.println(sb);
	}
	
	public static void solve(int i, int j) {
		if(i == num.length - 1) {
			sb.append(-1);
			return;
		}
		if(j == num.length) {
			sb.append(-1).append(" ");
			solve(i+1,i+2);
			return;
		}
		if(count[num[i]] < count[num[j]]) {
			sb.append(num[j]).append(" ");
			solve(i+1,i+2);
		}else {
			solve(i,j+1);
		}
	}
}
