package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_61_1932{
	static Integer[][] value ;
	static Integer[][] cache;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		int count = Integer.parseInt(br.readLine());
		
		value = new Integer[count][count];
		cache = new Integer[count][count];
		
		for(int i = 0; i < count; i++) {
			String input = br.readLine();
			String[] inputSplit = input.split(" ");
			for(int j = 0; j < inputSplit.length; j++) {
				value[i][j] = Integer.parseInt(inputSplit[j]);
			}
		}
		
		cache[0][0] = value[0][0];
		
		for(int i = 0; i < count; i++) {
			int num = calculator(count-1,i);
			answer = answer > num ? answer : num;
		}		
		
		System.out.println(answer);
	}
	
	public static int calculator(int row, int col) {
		if(cache[row][col] == null) {
			if(col == 0) {
				cache[row][col] = calculator(row-1,0) + value[row][col];
			}
			else if(col == row) {
				cache[row][col] = calculator(row-1,col-1) + value[row][col];
			}
			else {
				cache[row][col] = Math.max(calculator(row-1,col-1), calculator(row-1,col)) + value[row][col];
			}
			
		}
		
		return cache[row][col];
	}
}
