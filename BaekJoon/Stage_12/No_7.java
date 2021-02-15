package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_7 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int inputCount = Integer.parseInt(br.readLine());
		int[][] inputNum = new int[inputCount][2];
		
		for(int i = 0; i < inputCount; i++) {
			String inputLine = br.readLine();
			String[] lineSplit = inputLine.split(" ");
			inputNum[i][0] = Integer.parseInt(lineSplit[0]);
			inputNum[i][1] = Integer.parseInt(lineSplit[1]);
		}
		
		Arrays.sort(inputNum,new Comparator<int[]>() {

			@Override
			public int compare(int i1[], int i2[]) {
				// TODO Auto-generated method stub
				if(i1[1] == i2[1]) {
					return i1[0] - i2[0];
				}
				return i1[1] - i2[1];
			}
		});
		
		for(int i = 0; i < inputCount; i++) {
			sb.append(inputNum[i][0]).append(" ").append(inputNum[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
