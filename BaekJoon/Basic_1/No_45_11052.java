package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_45_11052 {
	static Integer[] cache ;
	static int[] value ;
	static float[] onePiece ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		value = new int[count+1];
		onePiece = new float[count+1];
		cache = new Integer[count+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 1; i <= count ; i++) {
			value[i] = Integer.parseInt(st.nextToken());
			onePiece[i] = (float)value[i] / i;
		}
		
		cache[0] = 0;
		cache[1] = value[1];
		
		if(count >= 2) cache[2] = Math.max(value[2], value[1] * 2);

		System.out.println(solve(count));
	}

	private static int solve(int count) {
		// TODO Auto-generated method stub
		if(cache[count] == null) {
			float max = 0;
			int target = -1;
			
			for(int i = 1; i < onePiece.length; i++) {
				if(onePiece[i] > max) {
					max = onePiece[i];
					target = i;
				}
			}
			cache[count] = count/target * value[target] + solve(count % target);
		}
		
		return cache[count];
	}
}
