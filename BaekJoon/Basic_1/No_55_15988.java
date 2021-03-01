package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_55_15988 {
	
	static StringBuilder sb = new StringBuilder();
	static Long[] cache = new Long[1000001];
	static int div = 1000000009;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		cache[0] = 1L;
		cache[1] = 1L;
		cache[2] = 2L;

		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(solve(num)).append("\n");
		}
		System.out.println(sb);
	}

	private static Long solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = (solve(num - 1) + solve(num - 2) + solve(num - 3)) % div;
		}
		return cache[num];
	}
}
