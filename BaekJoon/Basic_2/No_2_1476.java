package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2_1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int ansE = 1;
		int ansS = 1;
		int ansM = 1;
		int count = 1;
		
		while(!(ansE == E && ansS == S && ansM == M)) {
			ansE ++;
			ansS ++;
			ansM ++;
			count ++;
			
			if(ansE == 16) ansE = 1;
			if(ansS == 29) ansS = 1;
			if(ansM == 20) ansM = 1;
		}
		System.out.println(count);
	}
}
