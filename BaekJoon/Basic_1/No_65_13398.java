package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_65_13398 {
	
	static int[] value;
	static Integer[][] cache;
	static int jump = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1];
		cache = new Integer[count+1][2];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= count ; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		cache[1][0] = value[1];
		cache[1][1] = value[1];
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= count; i++) {
			max = Math.max(max, Math.max(solve(i)[0], solve(i)[1]));
		}
		
		System.out.println(max);
	}

	private static Integer[] solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num][0] == null) {
			cache[num][0] = Math.max(solve(num-1)[0] + value[num], value[num]);
		}
		if(cache[num][1] == null) {
			cache[num][1] = Math.max(solve(num-1)[0], solve(num-1)[1] + value[num]);
		}
		return cache[num];
	}
}
