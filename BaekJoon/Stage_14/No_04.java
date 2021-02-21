package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_04 {

	static Long[] cache = new Long[100];
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		cache[0] = 1L;
		cache[1] = 1L;
		cache[2] = 1L;
		cache[3] = 2L;
		cache[4] = 2L;
		
		int inputNum = Integer.parseInt(br.readLine());
		
		for(int i= 0; i < inputNum; i++) {
			int num = Integer.parseInt(br.readLine());
			sb.append(Fibbo(num)).append("\n");
		}
		System.out.println(sb);
	}


	private static Long Fibbo(int num) {
		// TODO Auto-generated method stub
		if(cache[num-1] == null) cache[num-1] = Fibbo(num-2) + Fibbo(num-3);
		return cache[num-1];
	}
}
