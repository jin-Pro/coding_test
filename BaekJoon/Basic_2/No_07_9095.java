package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_07_9095 {
	
	static StringBuilder sb = new StringBuilder();
	static Integer[] cache = new Integer[12];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		cache[0] = 1;
		cache[1] = 1;
		
		if(count >= 2) cache[2] = 2;
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sb.append(solve(num)).append("\n");
		}
		
		System.out.println(sb);
	}
	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = solve(num-1) + solve(num-2) + solve(num-3);
		}
		
		return cache[num];
	}
}
