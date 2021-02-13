package Stage_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_4 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		sb.append((int) (Math.pow(2, num)-1)).append('\n');
		
		hanoi(num,1,2,3);
		
		System.out.println(sb);
	}
	
	public static void hanoi(int num ,int from, int by ,int to) {
		if (num == 1) {
			sb.append(from + " " + to + '\n');
			return;
		} 
	    
		// STEP 1 : N-1개를 A에서 B로 이동
		hanoi(num - 1, from, to, by);
	    
		// STEP 2 : 1개를 A에서 C로 이동
		sb.append(from + " " + to+'\n');
	    
		// STEP 3 : N-1개를 B에서 C로 이동
		
		hanoi(num - 1, by, from, to);
	}
}
