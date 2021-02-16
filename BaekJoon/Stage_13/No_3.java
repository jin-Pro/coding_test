package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3 {
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		int visitLength = Integer.parseInt(inputSplit[0]);
		int arrLength = Integer.parseInt(inputSplit[1]);
		
		boolean[] visit = new boolean[visitLength];
		int[] arr = new int[arrLength]; 
		
		pick(visit,arr,0,0);
		System.out.println(sb);
	}

	private static void pick(boolean[] visit, int[] arr, int depth,int start) {
		// TODO Auto-generated method stub
		if(depth == arr.length) {
			for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i < visit.length; i++) {
			arr[depth] =  i+1;
			pick(visit,arr,depth+1,i);
		}
	}
}
