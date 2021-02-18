package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5 {
	static StringBuilder sb = new StringBuilder();
	static int answer = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int inputN = Integer.parseInt(br.readLine());
		
		int[] ches = new int[inputN];
		
		put(ches,0);
		
		System.out.println(answer);
	}
	
	public static void put(int[] ches,int depth) {
		int length = ches.length;
		
		if(depth == length) {
			answer ++;
			return ;
		}
		
		for(int i = 0; i < length; i++) {
			ches[depth] = i;
			if(checkChes(ches,depth)) {
				put(ches,depth+1);
			}
		}	
	}
	
	public static boolean checkChes(int[] ches,int depth) {
		for(int i = 0; i < depth; i++) {
			if(ches[i] == ches[depth]) return false;
			if(Math.abs(depth-i) == Math.abs(ches[depth] - ches[i])) return false;
 		}
		return true;
	}
}