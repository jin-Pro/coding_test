package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No_2_version_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			data.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(data);
		
		for(int i = 0; i < num; i++) {
			sb.append(data.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
}
