package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11 {
	static int[] num;
	static Integer[] cache;
	static int count;
	static int answer = 0 ;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());
		
		num = new int[count+1];
		cache = new Integer[count+1];
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		for(int i = 1; i <= count; i++) {
			num[i] = Integer.parseInt(inputSplit[i-1]);
		}
		
		cache[0] = 0;
		cache[1] = 1;
		
		int max = 0;
		
		for(int i = 1; i <= count; i++) {
			max = max > calculator(i) ? max : calculator(i);
		}
		
		System.out.println(max);
	}
	
	public static int calculator(int depth) {
		if(depth == 0) {
			return answer;
		}
		
		if(cache[depth] == null) {
			cache[depth] = 1;
			for(int i = depth-1; i > 0; i --) {
				if(num[depth] > num[i]) cache[depth] = Math.max(cache[depth],calculator(i) + 1);
			}
		}
		
		return cache[depth];
	}
}
