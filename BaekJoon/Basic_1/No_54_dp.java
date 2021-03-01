package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_54_dp {
	
	static int length;
	static int div = 1000000000;
	static Integer[][] cache = new Integer[201][201];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		length = Integer.parseInt(st.nextToken());
		System.out.println(solve(num,length));
	}

	private static Integer solve(int num, int depth) {
		// TODO Auto-generated method stub
		if(cache[num][depth] == null) {
			if(num ==1) return cache[num][depth] = depth;
			if(depth == 1) return cache[num][depth] = 1;
			
			cache[num][depth] = (solve(num,depth-1) + solve(num-1,depth)) % div;
		}
		
		return cache[num][depth];
	}
}
