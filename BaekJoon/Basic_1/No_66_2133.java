package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_66_2133 {

	static int[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		cache = new int[num+1];
		
		cache[0] = 1; 
		cache[1] = 0;
		if(num > 1) cache[2] = 3;
		
		for(int i=4;i<=num;i+=2) { 
			
			cache[i] = 3*cache[i-2]; 
			
			for(int j=0;j<i-2;j+=2) {
				
				cache[i]+=cache[j] * 2; 
				
			}
			
		}
		
		System.out.println(cache[num]);
	}
}
