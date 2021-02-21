package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_02 {

	static Integer[][][] cache = new Integer[21][21][21];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		while(true) {
			input = br.readLine();
			String[] inputSplit = input.split(" ");
			int a = Integer.parseInt(inputSplit[0]);
			int b = Integer.parseInt(inputSplit[1]);
			int c = Integer.parseInt(inputSplit[2]);
			
			if(a == -1 && b == -1 && c == -1) break;
			sb.append("w("+a+", "+b+", "+c+") = "+w(a,b,c)+"\n");
		}
		System.out.println(sb);
	}
	
	public static int w(int a , int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			return cache[0][0][0] = 1;
		}
		if(a > 20 || b > 20 || c > 20) {
			if(cache[20][20][20] != null) return cache[20][20][20];
			return cache[20][20][20] = w(20,20,20);
		}
		
		if(cache[a][b][c] != null) {
			return cache[a][b][c];
		}
				
		if(a < b && b < c) {
			
			return cache[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		}
		
		return cache[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		
	}
}
