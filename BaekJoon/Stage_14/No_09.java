package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_09 {

	static Long[][] cache;
	static long answer = 0 ;
	static int mod = 1000000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		cache = new Long[num+1][10];
		
		cache[1][0] = 0L;
		for(int i = 1; i < 10; i++) cache[1][i] = 1L;
		
		for(int i = 0; i < 10; i ++) {
			answer += calculator(num,i);
		}
		
		System.out.println(answer % mod);
	}

	private static long calculator(int num,int value) {
		// TODO Auto-generated method stub
		if(cache[num][value] == null) {
			if(value == 0) cache[num][value] = calculator(num-1,1);
			else if(value == 9) cache[num][value] = calculator(num-1,8);
			else cache[num][value] = calculator(num-1,value-1) + calculator(num-1,value+1);
		}
		
		return cache[num][value] % mod;
	}
}
