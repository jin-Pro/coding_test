package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_49_2193 {
	
	static Long[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		cache = new Long[num+1];
		cache[0] = 0L;
		cache[1] = 1L;
		
		System.out.println(solve(num));
	}

	private static Long solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = solve(num-1) + solve(num-2);
		}
		
		return cache[num];
	}
}
