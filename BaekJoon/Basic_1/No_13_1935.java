package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_13_1935 {
	
	static Stack<String> list = new Stack<String>();
	static String input ;
	static int[] num;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int charNum = Integer.parseInt(br.readLine());
		num = new int[charNum];
		
		input = br.readLine();
		
		for(int i = 0; i < charNum; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		solve();
	}
	
	public static void solve() {
		String[] inputSplit = input.split("");
		
		for(int i = 0; i < inputSplit.length; i++) {
			if(inputSplit[i].compareTo("+") != 0 && inputSplit[i].compareTo("-") != 0 && inputSplit[i].compareTo("*") != 0 && inputSplit[i].compareTo("/") != 0) {
				int indexNum = (int)inputSplit[i].charAt(0) - (int)'A';
				String inputList = String.valueOf(num[indexNum]);
				list.add(inputList);
			}else {
				double firstNum = Double.parseDouble(list.pop());
				double secondNum = Double.parseDouble(list.pop());
				
				switch(inputSplit[i]) {
				case "+":
					list.add(String.valueOf(firstNum + secondNum));
					break;
				case "-":
					list.add(String.valueOf(secondNum - firstNum));
					break;
				case "*":
					list.add(String.valueOf(firstNum * secondNum));
					break;
				case "/":
					list.add(String.valueOf(secondNum / firstNum));
					break;				}
			}
		}
		System.out.printf("%.2f",Double.parseDouble(list.pop()));
	}
}
