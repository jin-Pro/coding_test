package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_08 {
	
	static Integer[] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		cache = new Integer[num+1];
		
		cache[1] = 0;
		
		if(num >= 2) {
			cache[2] = 1;			
		}
		
		if(num >= 3) {
			cache[3] = 1;			
		}
		
		System.out.println(calculator(num));
	}
	
	public static int calculator(int num) {
		if(cache[num] == null) {
			if(num % 6 == 0) {
				cache[num] = Math.min(calculator(num/3), Math.min(calculator(num/2), calculator(num-1))) + 1;
			}else if(num % 3 == 0) {
				cache[num] = Math.min(calculator(num/3), calculator(num-1)) + 1;
			}else if(num % 2 == 0) {
				cache[num] = Math.min(calculator(num/2), calculator(num-1)) + 1;
			}else {
				cache[num] = calculator(num-1) + 1;				
			}
		}
		return cache[num];
	}
}
