package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_58_11057 {
	
	static Integer[][] cache ;
	static int div = 10007;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int depth = Integer.parseInt(br.readLine());
		cache = new Integer[depth+1][10];
		
		int answer = 0;
		
		for(int i = 0; i < 10; i++) {
			cache[1][i] = 1;
		}
		
		for(int i = 0; i < 10; i++) {
			answer += solve(depth,i);
			answer %= div;
		}
		
		System.out.println(answer);
	}

	private static int solve(int depth,int num) {
		// TODO Auto-generated method stub
		
		if(cache[depth][num] == null) {
			cache[depth][num] = 0;
			
			for(int i = num; i < 10; i++) {
				cache[depth][num] += (solve(depth-1,i)) % div;
			}
		}
		
		return cache[depth][num];
	}
}
