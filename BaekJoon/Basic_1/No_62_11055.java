package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_62_11055 {
	
	static int[] value ;
	static Integer[] cache;
	static int target = 1;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1];
		cache = new Integer[count+1];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= count; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		cache[0] = 0;
		cache[1] = value[1];
		
		int max = cache[1];
		
		for(int i = 2; i <= count; i++) {
			max = Math.max(max, solve(i));
		}
		
		System.out.println(max);
	}

	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = value[num];
			for(int i = 1; i < num; i++) {
				if(value[num] > value[i]) {
					cache[num] = Math.max(solve(i) + value[num], cache[num]) ;
				}
			}
		}
		
		return cache[num];
	}
}
