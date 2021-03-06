package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_08_15654 {
	
	static int[] value;
	static boolean[] visit;
	static int[] answer;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	static int target;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		value = new int[N];
		visit = new boolean[N];
		answer = new int[M];
		
		st = new StringTokenizer(br.readLine());

		for(int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(value);
		
		solve(0);
		
		System.out.println(sb);
	}
	
	static void solve(int depth) {
		if(depth == M) {
			for(int i = 0; i <M; i++) {
				sb.append(answer[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				answer[depth] = value[i];
				solve(depth+1);
				visit[i] = false;
			}
		}
	}
}
