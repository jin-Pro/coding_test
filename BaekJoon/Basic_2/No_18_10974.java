package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_18_10974 {
	
	static StringBuilder sb = new StringBuilder();
	static boolean[] visit;
	static int[] answer;
	static int num;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		num = Integer.parseInt(br.readLine());
		
		visit = new boolean[num];
		answer = new int[num];
		
		solve(0);
		
		System.out.println(sb);
	}
	
	static void solve(int depth) {
		if(depth == num) {
			for(int i = 0; i < num; i++) {
				sb.append(answer[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= num; i++) {
			if(!visit[i-1]) {
				visit[i-1] = true;
				answer[depth] = i;
				solve(depth+1);
				visit[i-1] = false;
			}
		}
	}
}
