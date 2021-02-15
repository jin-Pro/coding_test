package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_3_version_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		int[] sort = new int[num];
		
		for(int i = 0; i < num; i++) {
			sort[i] = (Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(sort);
		
		for(int i = 0; i < num; i++) {
			sb.append(sort[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
