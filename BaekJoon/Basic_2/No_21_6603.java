package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_21_6603 {
	
	static int count;
	static int[] value;
	static int[] answer;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		count = Integer.parseInt(st.nextToken());
		
		while(count != 0) {
			value = new int[count];
			answer = new int[count];
			visit = new boolean[count];
			
			
			for(int i = 0; i < count; i++) {
				value[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < count; i++) {
				answer[0] = value[i];
				solve(1);
			}
			
			sb.append("\n");
			
			st = new StringTokenizer(br.readLine());
			count = Integer.parseInt(st.nextToken());
		}
		System.out.println(sb);
	}
	
	static void solve(int depth) {
		if(depth == 6) {
			for(int i = 0; i < 6; i++) {
				sb.append(answer[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < count; i++) {
			if(!visit[i] && value[i] > answer[depth-1]) {
				visit[i] = true;
				answer[depth] = value[i];
				solve(depth+1);
				visit[i] = false;
			}
		}
	}
}
