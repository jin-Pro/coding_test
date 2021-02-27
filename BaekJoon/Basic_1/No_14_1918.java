package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_14_1918 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<String> list = new Stack<String>();
		
		String input = br.readLine();
		String[] inputSplit = input.split("");
		
		String answer = "";
		
		for(int i = 0; i < inputSplit.length; i++) {
			if(inputSplit[i].compareTo("(") == 0) {
				list.add(inputSplit[i]);
			}else if(inputSplit[i].compareTo(")") == 0) {
				while(!list.empty() && list.peek().compareTo("(") != 0) {
					answer += list.pop();
				}
				list.pop();
			}else if(inputSplit[i].compareTo("+") == 0 || inputSplit[i].compareTo("-") == 0) {
				while(!list.empty() && (list.peek().compareTo("+") == 0 ||
										list.peek().compareTo("-") == 0 ||
										list.peek().compareTo("*") == 0 ||
										list.peek().compareTo("/") == 0)){
					answer += list.pop();
				}
				list.add(inputSplit[i]);
			}else if(inputSplit[i].compareTo("*") == 0 || inputSplit[i].compareTo("/") == 0) {
				while(!list.empty() && (list.peek().compareTo("*") == 0 || list.peek().compareTo("/") == 0)){
					answer += list.pop();
				}
				list.add(inputSplit[i]);
			}else {
				answer += inputSplit[i];
			}
		}
		
		while(!list.empty()) {
			answer += list.pop();				
		}
		
		System.out.println(answer);
	}
}
