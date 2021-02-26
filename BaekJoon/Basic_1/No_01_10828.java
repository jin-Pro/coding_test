package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No_01_10828 {
//	push X: 정수 X를 스택에 넣는 연산이다.
//	pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	size: 스택에 들어있는 정수의 개수를 출력한다.
//	empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//	top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			if(input.contains("push")) {
				String[] inputSplit = input.split(" ");
				list.add(Integer.parseInt(inputSplit[1]));
			}
			
			switch(input) {
			case "pop":
				if(list.size()==0) {
					System.out.println(-1);
					break;
				}
				System.out.println(list.remove(list.size()-1));
				break;
				
			case "size":
				System.out.println(list.size());
				break;
			case "empty":
				if(list.size()==0) {
					System.out.println(1);
					break;
				}
				System.out.println(0);
				break;
			case "top":
				if(list.size()==0) {
					System.out.println(-1);
					break;
				}
				System.out.println(list.get(list.size()-1));
				break;
			}
		}
	}
}
