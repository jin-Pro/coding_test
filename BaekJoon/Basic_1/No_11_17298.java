package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_11_17298 {
	static String[] inputSplit ;
	static Stack<Integer> list = new Stack<Integer>();
	static int[] answer;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String input = br.readLine();
		inputSplit = input.split(" ");
		answer = new int[inputSplit.length];
		
		for(int i = 0; i < inputSplit.length; i++) {
			answer[i] = Integer.parseInt(inputSplit[i]);
		}
		
		solve();
		
		System.out.println(sb);
	}

	private static void solve() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < answer.length; i++) {
			
			while(!list.empty() && answer[list.peek()] < answer[i]) {
				answer[list.pop()] = answer[i];
			}
			
			list.push(i);
		}
		
		while(!list.empty()) {
			answer[list.pop()] = -1;
		}
		
		for(int i = 0; i < answer.length; i++) {
			sb.append(answer[i]).append(" ");
		}
	}
}

