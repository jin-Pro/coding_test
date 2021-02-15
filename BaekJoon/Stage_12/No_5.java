package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		String[] inputSplit = input.split("");
		int inputLength = inputSplit.length;
		Integer[] num = new Integer[inputLength];
		
		for(int i = 0; i < inputLength; i++) {
			num[i] = Integer.parseInt(inputSplit[i]);
		}
		
		Arrays.sort(num,new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return i2-i1;
			}
		});
		
		for(int i = 0; i< inputLength; i++) {
			sb.append(num[i]);
		}
		
		System.out.println(sb);
	}
}
