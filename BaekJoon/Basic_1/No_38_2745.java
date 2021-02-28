package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_38_2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		int answer = 0;
		
		for(int i = N.length()-1; i >= 0; i--) {
			int num = changeNum(N.charAt(i));
			
			answer += num * Math.pow(B, N.length()-1 - i);
		}
		
		System.out.println(answer);
	}

	private static int changeNum(char num) {
		// TODO Auto-generated method stub
		if(num >= '0' && num <= '9') {
			return ((int)num - (int)'0');
		}
		if(num >= 'A' && num <= 'Z') {
			return ((int)num - (int)'A' + 10);
		}
		return 0;
	}
}
