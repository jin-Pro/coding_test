package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_43_11727 {
	static Integer[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		cache = new Integer[num+1];
		
		cache[0] = 0;
		cache[1] = 1;
		
		if(num >= 2) cache[2] = 3;
		
		System.out.println(solve(num));
	}

	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = solve(num-1) + solve(num-2)*2;
		}
		
		return cache[num] % 10007;
	}
}
