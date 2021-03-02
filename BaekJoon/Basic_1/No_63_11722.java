package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_63_11722 {
	
	static int[] value;
	static Integer[] cache;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1];
		cache = new Integer[count+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = count; i >= 1; i--) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= count; i++) {
			max = Math.max(max, solve(i));
		}
		
		System.out.println(max);
		
	}
	
	private static int solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num] == null) {
			cache[num] = 1;
			for(int i = 1; i < num; i++) {
				if(value[num] > value[i]) {
					cache[num] = Math.max(cache[num], solve(i) + 1);
				}
			}
		}
		
		return cache[num];
	}
}
