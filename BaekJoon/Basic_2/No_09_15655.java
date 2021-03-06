package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_09_15655 {
	
	static int[] value;
	static int[] answer;
	static boolean[] visit;
	static int N;
	static int M;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		value = new int[N];
		answer = new int[M];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(value);
		for(int i = 0; i <N; i++) {
			answer[0] = value[i];
			solve(1);
		}
		
		System.out.println(sb);
	}
	
	static void solve(int depth) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(answer[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visit[i] && answer[depth-1] < value[i]) {
				visit[i] = true;
				answer[depth] = value[i];
				solve(depth+1);
				visit[i] = false;
			}
		}
	}
}
