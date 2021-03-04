package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_6_1748 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int answer = 0;
		if(num == 100000000) {
			answer = 9;
			answer += (100000000 - 10000000) * 8;
			answer += (10000000 - 1000000) * 7;
			answer += (1000000 - 100000) * 6;
			answer += (100000 - 10000) * 5;
			answer += (10000 - 1000) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1; 
		}
		else if(num >= 10000000) {
			answer = (num - 9999999) * 8;
			answer += (10000000 - 1000000) * 7;
			answer += (1000000 - 100000) * 6;
			answer += (100000 - 10000) * 5;
			answer += (10000 - 1000) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1; 
		}else if(num >= 1000000) {
			answer = (num - 999999) * 7;
			answer += (1000000 - 100000) * 6;
			answer += (100000 - 10000) * 5;
			answer += (10000 - 1000) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1;
		}else if(num >= 100000) {
			answer = (num - 99999) * 6;
			answer += (100000 - 10000) * 5;
			answer += (10000 - 1000) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1;
		}else if(num >= 10000) {
			answer = (num - 9999) * 5;
			answer += (10000 - 1000) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1;
		}else if(num >= 1000) {
			answer = (num - 999) * 4;
			answer += (1000 - 100) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1;
		}else if(num >= 100) {
			answer = (num - 99) * 3;
			answer += (100 - 10) * 2;
			answer += (10 - 1) * 1;
		}else if(num >= 10) {
			answer = (num - 9) * 2;
			answer += (10 - 1) * 1;
		}else {
			answer = num;
		}
		System.out.println(answer);
	}
}
