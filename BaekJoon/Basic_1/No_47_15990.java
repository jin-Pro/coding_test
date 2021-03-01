package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_47_15990 {
	static int cacheLength = 100001;
	static int div = 1000000009;
	static Integer[][] cache = new Integer[cacheLength][4];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		cache[1][1] = 1;
		cache[1][2] = 0;
		cache[1][3] = 0;
		cache[2][1] = 0;
		cache[2][2] = 1;
		cache[2][3] = 0;
		cache[3][1] = 1;
		cache[3][2] = 1;
		cache[3][3] = 1;
		
		for(int i = 0; i< count; i++) {
			int num = Integer.parseInt(br.readLine());
			
			Integer[] ans = solve(num);
			int sum = ans[1];
			sum += ans[2];
			sum %= div;
			sum += ans[3];
			sum %= div;
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

	private static Integer[] solve(int num) {
		// TODO Auto-generated method stub
		if(cache[num][1] == null) cache[num][1] = (solve(num-1)[2] + solve(num-1)[3])%div;
		if(cache[num][2] == null) cache[num][2] = (solve(num-2)[1] + solve(num-2)[3])%div;
		if(cache[num][3] == null) cache[num][3] = (solve(num-3)[1] + solve(num-3)[2])%div;
		
		
		return cache[num];
	}
}
