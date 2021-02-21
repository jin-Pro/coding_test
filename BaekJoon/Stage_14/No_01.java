package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_01 {
	
	static int zeroCount ;
	static int oneCount ;
	static int[][] cache = new int[41][3] ;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < cache.length; i++) {
			Arrays.fill(cache[i], -1);
		}
		cache[0][0] = 1;
		cache[0][1] = 0;
		cache[0][2] = 0;
		cache[1][0] = 0;
		cache[1][1] = 1;
		cache[1][2] = 1;
		
		
		int repeat = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < repeat; i++) {
			int num = Integer.parseInt(br.readLine());
			Fibbo(num);
			sb.append(cache[num][0] + " " + cache[num][1] + "\n");
		}
		System.out.println(sb);
	}
	
	public static int[] Fibbo(int num) {
	
		if(cache[num][2] == -1) {
			cache[num][0] = Fibbo(num-1)[0] + Fibbo(num-2)[0];
			cache[num][1] = Fibbo(num-1)[1] + Fibbo(num-2)[1];
			cache[num][2] = Fibbo(num-1)[2] + Fibbo(num-2)[2];
		}
		
		return cache[num];
	}
}
