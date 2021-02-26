package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_05_1406 {
	static Stack<String> real = new Stack<String>();
	static Stack<String> sub = new Stack<String>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		String[] inputSplit = input.split("");
		
		for(int i = 0; i < inputSplit.length; i++) {
			real.add(inputSplit[i]);
		}
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			solve(br.readLine());
		}
		
		for(int i = 1; i <= sub.size(); i++) {
			real.add(sub.get(sub.size()-i));
		}
		
		for(int i = 0; i < real.size(); i++) {
			sb.append(real.get(i));
		}
		
		System.out.println(sb);
	}
	
	public static void solve(String input) {
		if(input.contains("P")) {
			String[] inputSplit = input.split("");
			real.add(inputSplit[2]);
			
			return;
		}
		
		switch(input) {
		case "L":
			if(real.size() == 0) return;
			sub.add(real.pop());
			return;
		case "D":
			if(sub.size() == 0) return;
			real.add(sub.pop());
			return;
		case "B":
			if(real.size() == 0) return;
			real.pop();
			return;
		}
	}
}
