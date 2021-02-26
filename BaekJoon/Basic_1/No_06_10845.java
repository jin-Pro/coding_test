package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
public class No_06_10845 {
	
	static Stack<Integer> list = new Stack<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			solve(br.readLine());
		}
	}

	private static void solve(String input) {
		// TODO Auto-generated method stub
		if(input.contains("push")) {
			String[] inputSplit = input.split(" ");
			list.add(Integer.parseInt(inputSplit[1]));
			return ;
		}
		
		switch(input) {
		case "pop":
			if(list.size() == 0) {
				System.out.println(-1);
				return ;
			}
			System.out.println(list.remove(0));
			return;
		case "size":
			System.out.println(list.size());
			return;
		case "empty":
			if(list.size()==0) {
				System.out.println(1);
				return ;
			}
			System.out.println(0);
			return ;
		case "front":
			if(list.size()==0) {
				System.out.println(-1);
				return ;
			}
			System.out.println(list.get(0));
			return ;
		case "back":
			if(list.size()==0) {
				System.out.println(-1);
				return ;
			}
			System.out.println(list.get(list.size()-1));
			return;
		}
	}
}
