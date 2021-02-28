package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_44_9095 {
	static Integer[] cache = new Integer[11];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		cache[0] = 1;
		cache[1] = 1;
		cache[2] = 2;
		
		for(int i = 0; i < count; i++) {
			sb.append(solve(Integer.parseInt(br.readLine()))).append("\n");
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
