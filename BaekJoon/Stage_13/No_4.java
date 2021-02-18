package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4{
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		String[] inputSplit = input.split(" ");
		
		int N = Integer.parseInt(inputSplit[0]);
		int M = Integer.parseInt(inputSplit[1]);
		
		boolean[] visit = new boolean[N];
		int[] num = new int[M];
		
		pick(visit,num,0,0);
		
		System.out.println(sb);
	}
	
	public static void pick(boolean[] visit,int[] num,int depth,int start) {
		if(depth == num.length) {
			for(int i = 0; i < depth; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
			return ; 
		}
		
		for(int i = start; i < visit.length; i++) {
			if(visit[i] == false) {
				num[depth] = i+1;
				pick(visit,num,depth+1,i);
			}
		}
	}
}