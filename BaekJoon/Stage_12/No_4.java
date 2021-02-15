package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이

// 풀다가 생각해야되서 안품

public class No_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int totalNum = Integer.parseInt(br.readLine());
		
		int[] num = new int[totalNum];
		float sum = 0;
		int max = -4000;
		int min = 4000;
		int bestInput = 0;
		int bestInputNum = -4000;
		int[] count = new int[max];
		
		for(int i = 0; i < totalNum; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
			count[i] = 0;
			if(max < num[i]) max = num[i];
			if(min > num[i]) min = num[i];
		}
		
		for(int i = 0; i < totalNum; i++) {
			count[num[i]] ++;
		}
		
		for(int i = 0; i < totalNum; i++) {
			if(bestInput <= count[i]) {
				if(bestInputNum <1) {
					
				}
			}
		}
		
		System.out.printf("%.1f",sum/totalNum);
		
		Arrays.sort(num);
		
		if(num.length % 2 == 0) {
			sb.append(num[num.length/2-1]).append("\n");
		}else {
			sb.append(num[num.length/2]).append("\n");
		}
		
		
		
		
	}
}
