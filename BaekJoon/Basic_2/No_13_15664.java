package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class No_13_15664 {
	
	static int N;
	static int M;
	static int[] value ;
	static int[] answer;
	static boolean[] visit;
	static LinkedHashSet<String> list = new LinkedHashSet<String>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N];
		value = new int[N];
		answer = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(value);
		
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				answer[0] = value[i];
				solve(1,String.valueOf(value[i]) + " ");
				visit[i] = false;
			}
		}
		
		for(String s : list) {
			sb.append(s.substring(0,s.length()-1)).append("\n");
		}
		System.out.println(sb);
	}
	
	static void solve(int depth,String s) {
		if(depth == M) {
			list.add(s);
			return;
		}
		
		for(int i = 0; i <N; i++) {
			if(!visit[i] && (answer[depth-1] <= value[i])) {
				visit[i] = true;
				answer[depth] = value[i];
				solve(depth+1,s + String.valueOf(value[i]) + " ");
				visit[i] = false;
			}
		}
	}
}
