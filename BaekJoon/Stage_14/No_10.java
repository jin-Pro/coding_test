package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10 {
	static Integer[] cache;
	static int[] podo;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		podo = new int[num+1];
		cache = new Integer[num+1];
		
		for(int i = 1; i <= num; i++) {
			podo[i] = Integer.parseInt(br.readLine());
		}
		
		cache[0] = podo[0];
		
		cache[1] = podo[1];
		
		if(num >=2) {
			cache[2] = podo[1] + podo[2];
		}
		
		System.out.println(calculator(num));
	}
	
	public static int calculator(int depth) {
		if(cache[depth] == null) {
			cache[depth] = Math.max(Math.max(calculator(depth-3) + podo[depth-1], calculator(depth-2))+podo[depth],
					calculator(depth-1));
		}
		
		return cache[depth];
	}
}
