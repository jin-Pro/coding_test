package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_40_11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		while(num != 1) {
			for(int i = 2; i <= num; i++) {
				if(num % i == 0) {
					sb.append(i).append("\n");
					num /= i;
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}
