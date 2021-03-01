package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_57_1309 {
	
	static Integer[][] cache;
	static int div = 9901;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		cache = new Integer[num+1][3];
		
		cache[1][0] = 1;
		cache[1][1] = 1;
		cache[1][2] = 1;
		
		int answer = (solve(num,0) + solve(num,1) + solve(num,2)) % div;
		
		System.out.println(answer);
	}

	private static int solve(int num,int seat) {
		// TODO Auto-generated method stub
		if(cache[num][seat] == null) {
			switch(seat) {
			case 0:
				cache[num][seat] = (solve(num-1,0) + solve(num-1,1) + solve(num-1,2))%div;
				break;
			case 1:
				cache[num][seat] = (solve(num-1,0) + solve(num-1,2))%div;
				break;
			case 2:
				cache[num][seat] = (solve(num-1,0) + solve(num-1,1))%div;
			}
		}
		return cache[num][seat];
	}
}
