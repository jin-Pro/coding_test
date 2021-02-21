package Stage_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_05_BackTracking {
	static int count;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		count = Integer.parseInt(br.readLine());
		int[][] color = new int[count][3];
		
		for(int i = 0; i < count; i++) {
			String stringCost = br.readLine();
			String[] costSplit = stringCost.split(" ");
			color[i][0] = Integer.parseInt(costSplit[0]);
			color[i][1] = Integer.parseInt(costSplit[1]);
			color[i][2] = Integer.parseInt(costSplit[2]);
		}
		System.out.println(cost(color,0,0,-1));
	}
	
	public static int cost(int[][] color, int cost, int depth,int target) {
		if(depth == count) {
			if(min > cost) min = cost;
			return min;
		}
		
		for(int i = 0; i < 3; i++) {
			if(target == i) continue;
			cost += color[depth][i];
			cost(color,cost,depth+1,i);
			cost -= color[depth][i];
		}
		
		return min;
	}
}
