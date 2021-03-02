package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_67_17404 {
	static int[][] value;
	static Integer[][] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1][4];
		cache = new Integer[count+1][4];
		
		for(int i = 1; i <= count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			value[i][1] = Integer.parseInt(st.nextToken());
			value[i][2] = Integer.parseInt(st.nextToken());
			value[i][3] = Integer.parseInt(st.nextToken());
		}
		
		int paintMax = 1000 * count + 1;
		int answer = 1000001;
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(i == j) cache[1][j] = value[1][j];
				else cache[1][j] = paintMax;
			}
			for(int j = 2; j <= count; j++) {
				cache[j][1] = Math.min(cache[j-1][2], cache[j-1][3]) + value[j][1];
				cache[j][2] = Math.min(cache[j-1][1], cache[j-1][3]) + value[j][2];
				cache[j][3] = Math.min(cache[j-1][1], cache[j-1][2]) + value[j][3];		
			}
			
			for(int j = 1; j <= 3; j++) {
				if(i == j) continue;
				answer = Math.min(answer,cache[count][j]);
			}
		}
		
		System.out.println(answer);
	}
}
