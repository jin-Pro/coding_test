package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_30_2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		int third = first-second;
		
		int fiveNum = numCount(first,5) - numCount(second,5) - numCount(third,5);
		int twoNum = numCount(first,2) - numCount(second,2) - numCount(third,2);
		
		System.out.println(Math.min(fiveNum,twoNum));
	}

	private static int numCount(int order, int num) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		while(order >= num) {
			answer += (order/num);
			order /= num;
		}
		
		return answer;
	}
}
