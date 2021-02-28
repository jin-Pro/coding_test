package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_31_9613 {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int count = Integer.parseInt(st.nextToken());
			
			int[] inputNum = new int[count];
			
			for(int j = 0; j < count; j++) {
				inputNum[j] = Integer.parseInt(st.nextToken());
			}
			
			solve(inputNum);
		}
		
		System.out.println(sb);
		
	}

	private static void solve(int[] inputNum) {
		// TODO Auto-generated method stub
		int target = 0;
		int answer = 0;
		
		for(int i = 0; i < inputNum.length -1 ; i++) {
			for(int j = i+1; j < inputNum.length; j++) {
				for(int k = 1; k <=Math.min(inputNum[i], inputNum[j]); k++) {
					if(inputNum[i] % k == 0 && inputNum[j] % k == 0) {
						target = k;
					}
				}
				answer += target;
			}
		}
		sb.append(answer).append("\n");
	}
}
