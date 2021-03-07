package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_17_10973 {
	
	static Integer[] value;
	static int num;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		num = Integer.parseInt(br.readLine());
		value = new Integer[num];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < num; i++) {
			value[i] = Integer.parseInt(st.nextToken());
		}
		
		solve();
	}
	
	private static void solve() {
		StringBuilder sb = new StringBuilder();
		int target = -1;
		
		for(int i = num-1 ; i > 0 ; i--) {
			if(value[i] < value[i-1]) {
				target = i-1;
				break;
			}
		}
		if(target == -1) {
			System.out.println(-1);
			System.exit(0);
		}
		
		int changeTarget = -1;
		int max = 0;

		for(int i = target + 1; i < num; i++) {
			if(value[target] > value[i] && max < value[i]) {
				max = value[i];
				changeTarget = i;
			}
		}
		int temp = value[target];
		value[target] = value[changeTarget];
		value[changeTarget] = temp;
		
		Arrays.sort(value,target+1,num,new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				// TODO Auto-generated method stub
				return i2 - i1;
			}
			
		});
		
		for(int i = 0; i < num; i++) {
			sb.append(value[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
