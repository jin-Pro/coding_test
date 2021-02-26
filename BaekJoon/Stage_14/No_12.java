package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_12 {
	
	static Integer[] cache;
	static Integer[] reverseCache;
	static int[] num;
	static int count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());
		
		cache = new Integer[count+1];
		reverseCache = new Integer[count+1];
		
		num = new int[count];
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		for(int i = 0; i < count; i++) {
			num[i] = Integer.parseInt(inputSplit[i]);
		}
		
		
		for(int i = 1; i <= count ; i++) {
			solve(i);
			solve2(i);
		}
		
		int max = 0;

		for(int i = 1; i <= count; i++) {
			max = Math.max(cache[i] + reverseCache[i], max);
		}
		
		System.out.println(max-1);
	}

	private static int solve2(int depth) {
		// TODO Auto-generated method stub
		if(reverseCache[depth] == null) {
			reverseCache[depth] = 1;
			
			for(int i = depth; i < count; i ++) {
				if(num[i] < num[depth-1]) {
					reverseCache[depth] = Math.max(solve2(i+1)+1, reverseCache[depth]);
				}
			}
		}
		return reverseCache[depth];
	}

	private static int solve(int depth) {
		// TODO Auto-generated method stub
		
		if(cache[depth] == null) {
			cache[depth] = 1;
			
			for(int i = depth-2; i >= 0; i --) {
				if(num[i] < num[depth-1]) {
					cache[depth] = Math.max(solve(i+1)+1, cache[depth]);
				}
			}
		}
		return cache[depth];
	}
}
