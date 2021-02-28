package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_27_6588 {
	static Integer[] cache = new Integer[1000001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int input ;
		cache[2] = -1;
		cache[3] = 3;
		while((input = Integer.parseInt(br.readLine())) != 0) {
			int answer = Integer.MAX_VALUE;
			int realFirst = 0;
			int realSecond = 0;
			
			for(int i = 3; i <= input/2; i++) {
				if(cache[i] == null) { // �Ҽ����� �Ǻ��ؾ���
					for(int j = 2; j <= Math.sqrt(i); j++) {
						if(i % j == 0) { //�Ҽ��� �ƴϸ� -1�� �ִ´�.
							cache[i] = -1;
							break;
						}else if(j == Math.floor(Math.sqrt(i))) { //�Ҽ���� cache�� ���� �־��ش�.
							cache[i] = i;
						}
					}
					
				}
				int first = cache[i];
				if(cache[i] == -1) { //�Ҽ��� �ƴϴ�.
					continue;
				}

				int secondIndex = input - first;
				
				if(cache[secondIndex] == null) {
					for(int j = 2; j <= Math.sqrt(secondIndex); j++) {
						if( secondIndex % j == 0) {
							cache[secondIndex] = -1;
							break;
						}else if( j == Math.floor(Math.sqrt(secondIndex))) {
							cache[secondIndex] = secondIndex;
						}
					}
				}				
				if(cache[secondIndex] == -1) {
					continue;
				}
				
				int second = cache[secondIndex];
				if(answer > second - first) {
					answer = first - second;
					realFirst = first;
					realSecond = second;
				}
			}
			sb.append(input + " = " + realFirst + " + " + realSecond).append("\n");
		}
		System.out.println(sb);
	}
}
