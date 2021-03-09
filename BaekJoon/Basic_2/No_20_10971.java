package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_20_10971 {
	
	static int[][] value;
	static boolean[] visit;
	static int[] answer;
	static int count;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		count = Integer.parseInt(br.readLine());
		value = new int[count][count];
		visit = new boolean[count];
		answer = new int[count];
		
		for(int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < count; j++) {
				value[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < count; i++) {
			visit[i] = true;
			solve(i,1,i);
			visit[i] = false;
		}
		
		System.out.println(min);
	}
	
	static void solve(int start,int depth,int first) {
		if(depth == count) {
			int sum = 0;
			if(value[start][first] == 0 ) return ;
			for(int i = 1; i < count; i++) {
				sum += answer[i];
			}
			sum += value[start][first];
			min = Math.min(min, sum);
			return ;
		}
		
		for(int i = 0; i < count; i++) {
			if(value[start][i] != 0 && !visit[i]) {
				
				if(value[start][i] == 0) return ; 
				
				visit[i] = true;
				
				answer[depth] = value[start][i];
				solve(i,depth+1,first);
				
				visit[i] = false;
			}
		}
	}
}
