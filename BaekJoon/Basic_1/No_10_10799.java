package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(solve(br.readLine()));
	}

	private static int solve(String input) {
		// TODO Auto-generated method stub
		String[] inputSplit = input.split("");
		
		int stick = 0;
		int count = 0;
		
		for(int i = 0; i < inputSplit.length; i++) {
			if(inputSplit[i].compareTo("(") == 0) {
				stick ++;
			}else {
				stick --;
				if(inputSplit[i-1].compareTo("(") == 0) {
					count += stick;
				}else {
					count ++;
				}
			}	
		}
		return count;
	}
}
