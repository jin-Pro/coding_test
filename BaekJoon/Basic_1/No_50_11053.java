package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_50_11053 {
	
	static int[] value ;
	static Integer[] cache;
	
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
		
		for(int i = 1; i <= count; i++) {
			answer = Math.max(answer, solve(i));
		}
		System.out.println(answer);
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
