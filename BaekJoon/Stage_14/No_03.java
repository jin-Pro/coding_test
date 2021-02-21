package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_03 {
	
	static Integer[] cache ;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		cache = new Integer[length+2];
		cache[1] = 1;
		cache[2] = 2;
		System.out.println(Fibbo(length)% 15746);
	}
	
	public static int Fibbo(int length) {
		if(cache[length] == null ) {
			cache[length] = (Fibbo(length-1) + Fibbo(length-2));
		}
		
		return cache[length] ;
	}
}
