package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_25_1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int answer = 0;
		
		for(int i = 0; i < count; i++) {
			
			double target = Double.parseDouble(st.nextToken());
			if(target == 1) {
				continue;
			}
			if(target == 2 || target == 3) {
				answer++;
			}
			
			for(int j = 2; j<= Math.sqrt(target); j++) {
				if(target % j == 0) {
					break;
				}
				if(j == Math.floor(Math.sqrt(target))) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
