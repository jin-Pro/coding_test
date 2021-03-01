package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_48_10844 {
	
	static Integer[][] cache ;
	static int div = 1000000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		
		cache = new Integer[num+1][10];
		cache[1][0] = 0;
		for(int i = 1; i < 10; i++) {
			cache[1][i] = 1;
		}
		for(int i = 0; i < 10; i++) {
			answer += solve(num,i);
			answer %= div;
		}
		System.out.println(answer);
	}

	private static Integer solve(int num,int one) {
		// TODO Auto-generated method stub
		if(cache[num][one] == null) {
			if(one == 0) cache[num][one] = solve(num-1,one+1) % div;
			else if(one == 9) cache[num][one] = solve(num-1,one-1) % div;
			else cache[num][one] = (solve(num-1,one-1) + solve(num-1,one+1)) % div;
		}
		
		return cache[num][one];
	}
}	
