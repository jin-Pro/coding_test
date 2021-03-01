package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_56_1149 {
	
	static int[][] value;
	static Integer[][] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1][4];
		cache = new Integer[count+1][4];
		
		for(int i = 1; i <= count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			value[i][1] = Integer.parseInt(st.nextToken());
			value[i][2] = Integer.parseInt(st.nextToken());
			value[i][3] = Integer.parseInt(st.nextToken());
		}
		
		cache[1][1] = value[1][1];
		cache[1][2] = value[1][2];
		cache[1][3] = value[1][3];
		
		solve(count);
		
		System.out.println(Math.min(cache[count][1], Math.min(cache[count][2], cache[count][3])));
	}

	private static Integer[] solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num][1] == null) {
			cache[num][1] = Math.min(solve(num-1)[2], solve(num-1)[3]) + value[num][1];
		}
		if(cache[num][2] == null) {
			cache[num][2] = Math.min(solve(num-1)[1], solve(num-1)[3]) + value[num][2];
		}
		if (cache[num][3] == null) {
			cache[num][3] = Math.min(solve(num-1)[1], solve(num-1)[2]) + value[num][3];
		}
		
		return cache[num];
	}
}
