package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_39_11576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int count = Integer.parseInt(br.readLine());
		int[] num = new int[count+1];
		
		st = new StringTokenizer(br.readLine());
		
		
		for(int i = 1; i <= count; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		
		for(int i = count; i > 0; i--) {
			answer += num[i] * Math.pow(A, count - i);
		}
		
		String ans = "";
		
		while(answer != 0) {
			ans = String.valueOf(answer % B) + " " + ans;
			answer /= B;
		}
		
		System.out.println(ans);
	}
}
