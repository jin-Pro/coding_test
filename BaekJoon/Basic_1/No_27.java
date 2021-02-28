package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_27 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int Max = 1000001;
		
		boolean[] cache = new boolean[Max];
		
		for(int i = 2; i < Max; i++) {
			cache[i] = true;
        }
		
        for(int i = 2; i < Max; i++) {
            for(int j = i * 2; j < Max; j += i) {
                if(!cache[j]) continue;
                cache[j] = false;
            }
        }
        
		int input;
		
		while((input = Integer.parseInt(br.readLine())) != 0) {
			for(int i = 3; i <= input/2; i++) {
				if(cache[i] && cache[input-i]) {
					sb.append(input + " = " + i + " + " + (input-i)).append("\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
