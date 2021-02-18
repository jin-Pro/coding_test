package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_7 {
	static int max = -1000000000 ;
	static int min = 1000000000;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int numLength = Integer.parseInt(br.readLine());
		
		int[] num = new int[numLength];
		int[] op = new int[4];
		
		String inputNum = br.readLine();
		String[] inputSplit = inputNum.split(" ");
		
		for(int i = 0; i < numLength; i++) {
			num[i] = Integer.parseInt(inputSplit[i]);
		}
		
		String inputOp = br.readLine();
		String[] inputOpSplit = inputOp.split(" ");
		
		for(int i = 0; i < op.length; i++) {
			op[i] = Integer.parseInt(inputOpSplit[i]);
		}
		
		calculator(num,op,1,0,num[0]);
		
		sb.append(max + "\n" + min);
		System.out.println(sb);
	}
	
	public static void calculator(int[] num, int[] op,int numCount, int opCount, int answer) {
		if(opCount == num.length - 1) {
			compareAnswer(answer);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(op[i] != 0) {
				op[i] --;
				switch(i) {
				case 0:
					calculator(num,op,numCount+1,opCount+1,answer + num[numCount]);
					break;
				case 1:
					calculator(num,op,numCount+1,opCount+1,answer - num[numCount]);
					break;
				case 2:
					calculator(num,op,numCount+1,opCount+1,answer * num[numCount]);
					break;
				case 3:
					calculator(num,op,numCount+1,opCount+1,answer / num[numCount]);
					break;
				}
				op[i] ++;
			}
		}
	}
	
	public static void compareAnswer(int answer) {
		max = (max > answer) ? max : answer;
		min = (min > answer) ? answer : min;
	}
}
