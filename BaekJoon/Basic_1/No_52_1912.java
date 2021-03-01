package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_52_1912 {
	
	static int[] value ;
	static Integer[] cache;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		value = new int[count];
		cache = new Integer[count+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		cache[1] = value[0];
		
		int max = -1000;
		
		for(int i = 1; i <=count; i++) {
			max = Math.max(max, solve(i));
		}
		
		System.out.println(max);
	}

	private static int solve(int num) {
		// TODO Auto-generated method stub
		if (cache[num] == null){
			cache[num] = Math.max(solve(num-1) + value[num-1], value[num-1]);
		}
		return cache[num];
	}
}
