package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_59_9465 {
	
	static Integer[][] cache;
	static int[][] value;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			int num = Integer.parseInt(br.readLine());
			value = new int[num+1][2];
			cache = new Integer[num+1][3];

			st = new StringTokenizer(br.readLine());
			
			
			for(int j = 1; j <= num; j++) {
				value[j][0] = Integer.parseInt(st.nextToken());
			}
			
		    st = new StringTokenizer(br.readLine());
		    
		    for(int j = 1; j <= num; j++) {
				value[j][1] = Integer.parseInt(st.nextToken());
			}
		    
			cache[1][0] = 0;
			cache[1][1] = value[1][0];
			cache[1][2] = value[1][1];
			
			sb.append(Math.max(solve(num,0), Math.max(solve(num,1), solve(num,2)))).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int solve(int num, int item) {
		// TODO Auto-generated method stub
		if(cache[num][item] == null) {
			if(item == 0) {
				cache[num][0] = Math.max(solve(num-1,0), Math.max(solve(num-1,1), solve(num-1,2)));
			}
			if(item == 1) {
				cache[num][1] = Math.max(solve(num-1,0),solve(num-1,2)) + value[num][0];
			}
			if(item == 2) {
				cache[num][2] = Math.max(solve(num-1,0), solve(num-1,1)) + value[num][1];
			}
		}
		return cache[num][item];
	}
}
