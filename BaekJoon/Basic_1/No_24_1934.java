package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_24_1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			int num = Math.min(first, second);
			int max = 0;

			for(int j = 1; j <= num; j++) {
				if(first % j == 0 && second % j == 0) {
					max = j;
				}	
			}
			
			sb.append(first * second / max).append("\n");
		}
		
		System.out.println(sb);
	}
}
