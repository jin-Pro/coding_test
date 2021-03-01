package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_54_2225 {
	
	static int length;
	static int answer = 0;
	static int div = 1000000000;
	static Integer[][] cache = new Integer[201][201];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		length = Integer.parseInt(st.nextToken());
		
		solve(num,0);
		
		System.out.println(answer);
	}

	private static void solve(int num, int depth) {
		// TODO Auto-generated method stub
		if(depth == length && num == 0) {
			answer ++;
			answer %= div;
			return;
		}
		
		if(depth == length) return ;
		if(num < 0) return ;
		
		for(int i = 0; i <=num; i++) {
			solve(num-i,depth+1);
		}
	}
}
