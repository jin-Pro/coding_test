package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class No_14_15665 {
	
	static int N;
	static int M;
	static int[] value;
	static LinkedHashSet<String> list = new LinkedHashSet<String>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		value = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(value);
		
		solve(0,"");
		
		for(String s : list) {
			sb.append(s.substring(0,s.length())).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void solve(int depth, String s) {
		if(depth == M) {
			list.add(s);
			return;
		}
		
		for(int i =0; i < N; i++) {
			solve(depth+1,s + String.valueOf(value[i]) + " ");
		}
	}
}
