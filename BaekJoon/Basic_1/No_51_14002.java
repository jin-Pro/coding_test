package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_51_14002 {
	
	static int[] value ;
	static Integer[] cache;
	static int[] path;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count];
		cache = new Integer[count+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < count ; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0;
		int target = 0;
		for(int i = 1; i <= count; i++) {
			if(solve(i) > answer) {
				answer = solve(i);
				target = i;
			}
		}
		
		sb.append(answer).append("\n");
		
		path = new int[answer];
		
		getPath(target);
		
		System.out.println(sb);
	}

	private static void getPath(int target) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i = 1; i <= target; i++) {
			if(cache[i] == count+1) {
				sb.append(value[i-1]).append(" ");
				count++;
			}
		}
	}

	private static Integer solve(int count) {
		// TODO Auto-generated method stub
		if(count == 0) return 1;
		
		if(cache[count] == null) {
			cache[count] = 1;
			
			for(int i = 1; i < count; i++) {
				if(value[count-1] > value[i-1]) {
					cache[count] = Math.max(cache[count], solve(i) + 1);
				}
			}
		}	
		return cache[count];
	}
}