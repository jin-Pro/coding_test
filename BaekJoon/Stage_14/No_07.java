package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_07 {
	static int[] stair ;
	static Integer[] cache;
	static int stairCount;
	static int answer = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		stairCount = Integer.parseInt(br.readLine());
		
		stair = new int[stairCount + 1];
		cache = new Integer[stairCount + 1];
		
		for(int i = 1; i <= stairCount ; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		cache[0] = stair[0];
		cache[1] = stair[1];
		
		if(stairCount >= 2) {
			cache[2] = stair[1] + stair[2];			
		}

		System.out.println(calculator(stairCount));
	}
	
	public static int calculator(int depth) {
		if(cache[depth] == null) {
			cache[depth] = Math.max(calculator(depth-2), calculator(depth-3) + stair[depth-1]) + stair[depth];
		}
		
		return cache[depth];
	}
}
