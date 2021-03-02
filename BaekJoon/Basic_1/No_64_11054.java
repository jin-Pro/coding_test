package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_64_11054 {
	
	static int[] value ;
	static Integer[] cache;
	static Integer[] cache2;
	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		count = Integer.parseInt(br.readLine());
		value = new int[count+1];
		cache = new Integer[count+1];
		cache2 = new Integer[count+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= count; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 1; i <= count; i++) {
			solve(i);
			solve2(i);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= count; i++) {
			max = Math.max(max, cache[i] + cache2[i]);
		}
		
		System.out.println(max-1);
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
	
	private static int solve2(int num) {
		if(cache2[num] == null) {
			cache2[num] = 1;
			for(int i = num+1; i <= count; i++) {
				if(value[num] > value[i]) {
					cache2[num] = Math.max(cache2[num], solve2(i) + 1);
				}
			}
		}
		return cache2[num];
	}
}
