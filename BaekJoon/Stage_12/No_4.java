package Stage_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//������ : N���� ������ ���� N���� ���� ��
//�߾Ӱ� : N���� ������ �����ϴ� ������ �������� ��� �� �߾ӿ� ��ġ�ϴ� ��
//�ֺ� : N���� ���� �� ���� ���� ��Ÿ���� ��
//���� : N���� ���� �� �ִ񰪰� �ּڰ��� ����

// Ǯ�ٰ� �����ؾߵǼ� ��ǰ

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
