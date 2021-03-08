package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_19_10819 {
	
	static int num;
	static int[] value;
	static int[] newArr;
	static boolean[] visit;
	static int max = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		num = Integer.parseInt(br.readLine());
		value = new int[num];
		newArr = new int[num];
		visit = new boolean[num];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		solve(0);
		
		System.out.println(max);
	}
	
	static void solve(int depth) {
		if(depth == num) {
			int sum = 0;
			for(int i = 0; i < num-1; i++) {
				sum += Math.abs(newArr[i] - newArr[i+1]);
			}
			max = Math.max(sum, max);
		}
		for(int i = 0; i < num; i++){
			if(!visit[i]) {
				visit[i] = true;
				newArr[depth] = value[i];
				solve(depth+1);
				visit[i] = false;
			}
		}	
	}
}
