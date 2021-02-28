package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_36_17103 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		boolean[] cache = new boolean[1000001];
		
		for(int i = 2; i < cache.length; i++) {
			for(int j = i*2; j <cache.length; j += i) {
				cache[j] = true;
			}
		}
		
		for(int i = 0; i < count; i++) {
			int num = Integer.parseInt(br.readLine());
			int answer = 0;
			for(int j = 2; j <= num/2; j++) {
				if(!cache[j] && !cache[num-j]) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		
		System.out.println(sb);
	}
}
