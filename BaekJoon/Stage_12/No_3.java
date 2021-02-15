package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		int[] num = new int[count];
		int[] temp = new int[count];
		int[] sort = new int[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = Integer.parseInt(br.readLine());
			temp[i] = 0;
		}
		
		for(int i = 0; i < count; i++) {
			temp[num[i]] ++;
		}
		
		for(int i = 0; i < count - 1; i++) {
			temp[i+1] += temp[i];
		}
		
		for(int i = count - 1; i >= 0 ; i--) {
			int index = --temp[num[i]];
			sort[index] = num[i];
		}
		
		for(int i = 0; i < count; i++) {
			sb.append(sort[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
