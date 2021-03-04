package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_1_2309 {
	
	static int[] list;
	static int weight = 100;
	static int[] ans;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		list = new int[10];
		ans = new int[7];
		
		for(int i = 0; i < 9; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		
		solve(0,0);
	}
	
	private static void solve(int depth, int answer) {
		if(answer > weight) return ;
		
		if(depth == 7) {
			if(answer == weight) {
				Arrays.sort(ans);
				for(int i = 0; i <7; i++) {
					sb.append(ans[i]).append("\n");
				}
				System.out.println(sb);
				System.exit(0);
			}else {
				return ;
			}
		}
		
		for(int i = depth; i < 9; i++) {
			ans[depth] = list[i];
			solve(depth+1,answer+list[i]);
		}
	}
}
