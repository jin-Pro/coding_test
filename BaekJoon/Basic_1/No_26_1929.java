package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_26_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		for(int i = first; i <= second; i++) {
			if(i == 2 || i == 3) {
				sb.append(i).append("\n");
			}
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					break;
				}
				if(j == Math.floor(Math.sqrt(i))) {

					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
