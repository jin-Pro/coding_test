package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		int totalNum = Integer.parseInt(inputSplit[0]);
		int setNum = Integer.parseInt(inputSplit[1]);
		
		boolean[] visit = new boolean[totalNum];
		int[] num = new int[setNum];
		
		pick(visit,num,0);
		
		System.out.println(sb);
	}
	
	public static void pick(boolean[] visit, int[] num, int depth) {
		if(depth == num.length) {
			for(int i = 0; i < num.length; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
			return ;
		}
	
		for(int i = 0; i<visit.length; i++) {
			if(visit[i] == false) {
				visit[i] = true;
				num[depth] = i+1;
				pick(visit,num,depth+1);
				visit[i] = false;
			}
		}
	}
}
