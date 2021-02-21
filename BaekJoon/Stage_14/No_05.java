package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_05 {
	static int count ;
	static Integer[][] value ;
	static Integer[][] cache ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());

		value = new Integer[count][3];
		cache = new Integer[count][3];
		
		for(int i = 0; i < count; i++) {
			String stringCost = br.readLine();
			String[] costSplit = stringCost.split(" ");
			value[i][0] = Integer.parseInt(costSplit[0]);
			value[i][1] = Integer.parseInt(costSplit[1]);
			value[i][2] = Integer.parseInt(costSplit[2]);
		}
		cache[0][0] = value[0][0];
		cache[0][1] = value[0][1];
		cache[0][2] = value[0][2];
		
		System.out.println(Math.min(cost(count,0), Math.min(cost(count,1), cost(count,2))));
	}
	
	public static int cost(int depth, int color) {
		
		if(cache[depth-1][color] == null) {
			if(color == 0) {
				cache[depth-1][color] = Math.min(cost(depth-1,1), cost(depth-1,2)) + value[depth-1][color];
			}
			if(color == 1) {
				cache[depth-1][color] = Math.min(cost(depth-1,0), cost(depth-1,2)) + value[depth-1][color];
			}
			if(color == 2) {
				cache[depth-1][color] = Math.min(cost(depth-1,0), cost(depth-1,1)) + value[depth-1][color];
			}
		}
		
		return cache[depth-1][color];
		
	}
}
