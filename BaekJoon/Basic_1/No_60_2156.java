package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_60_2156 {
	
	static int[] value;
	static Integer[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		value = new int[count+1];
		cache = new Integer[count+1];
		
		for(int i = 1; i <= count; i++) {
			value[i] = Integer.parseInt(br.readLine()); 
		}
		
		cache[0] = 0;
		cache[1] = value[1];
		
		if(count >= 2) cache[2] = cache[1] + value[2];
		
		System.out.println(solve(count));
	}

	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = Math.max(Math.max(solve(num-2) , solve(num-3) + value[num-1]) + value[num], solve(num-1));
		}
		return cache[num];
	}
}
