package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_37_11005 {
	static String addNum;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		String answer = "";
		
		while(N != 0) {
			addNum = "";
			//addNum 이 10이상인지 확인해야함
			solve(N%B);
			answer = addNum + answer;
			N /= B;
		}
		
		System.out.println(answer);
	}

	private static void solve(int num) {
		// TODO Auto-generated method stub
		if(num < 10) {
			addNum = String.valueOf(num);
		}else {
			addNum = String.valueOf((char)(num - 10 + (int)'A'));
		}
		return;
	}
}
