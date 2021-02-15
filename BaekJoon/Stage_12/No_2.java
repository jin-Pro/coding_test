package Stage_12;

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] num = new int[count];
		
		for(int i = 0; i < count; i++) {
			num[i] = sc.nextInt();
		}
		
		division(num,0,count-1);
		
		for(int i = 0; i < count; i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void division(int[] num,int start, int end) {
		if(start == end) {
			return ;
		}
		int middle = (start + end) / 2 ;

		division(num,start,middle);
		division(num,middle+1,end);
		combine(num,start,end);
	}
	
	public static void combine(int[] num,int start, int end) {
		int[] temp = new int[end-start+1];
		int middle = (start + end) /2;
		
		int i = start;
		int j = middle+1;
		int k = 0;
		
		while((i <= middle) &&(j <= end)) {
			if(num[i] < num[j]) {
				temp[k++] = num[i++];
			}else {
				temp[k++] = num[j++];
			}
		}
		
		while(j <= end) {
			temp[k++] = num[j++];
		}
		
		while(i <= middle) {
			temp[k++] = num[i++];
		}
		
		for(int index = start; index <= end ; index ++) {
			num[index] = temp[index-start];
		}
	}
}






















