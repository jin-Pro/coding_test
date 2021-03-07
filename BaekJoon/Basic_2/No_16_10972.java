package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No_16_10972 {

	static int num;
	static String input = "";
	static int[] value;
	static boolean[] visit;
	static boolean print = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		num = Integer.parseInt(br.readLine());
		value = new int[num];
		visit = new boolean[num];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			value[i] = Integer.parseInt(st.nextToken());
			input += String.valueOf(value[i]);
			input += " ";
		}
		
		Arrays.sort(value);
		
		solve(0,"");
		System.out.println(-1);
	}
	
	static void solve(int depth, String s) {
		if(depth == num) {
			if(print) {
				System.out.println(s);
				System.exit(0);
			}
			if(s.compareTo(input) == 0) {
				print = true;
			}
			return;
		}
		
		for(int i = 0 ; i < num; i++) {
			if(!visit[i]) {
				visit[i] = true;
				solve(depth+1,s+String.valueOf(value[i])+" ");
				visit[i] = false;
			}
		}
		
	}
}

//메모리 초과..
