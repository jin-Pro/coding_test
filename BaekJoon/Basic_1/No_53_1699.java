package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_53_1699 {
	
	static Integer[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		cache = new Integer[num+1];
		cache[1] = 1;
		if(num >= 2) cache[2] = 2;
		if(num >= 3) cache[3] = 3;
		
		System.out.println(solve(num));
	}

	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			int smallNum = (int)Math.floor(Math.sqrt(num));
			if(smallNum == Math.sqrt(num)) {
				return cache[num] = 1;
			}
			cache[num] = solve((int)Math.pow(smallNum, 2)) + solve(num-(int)Math.pow(smallNum, 2));
		}
		return cache[num];
	}
}
