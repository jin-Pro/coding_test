package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class No_08_10866 {
	static Stack<Integer> deque = new Stack<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			solve(br.readLine());
		}
		System.out.println(sb);
	}

	private static void solve(String input) {
		// TODO Auto-generated method stub
		if(input.contains("push_front")) {
			deque.add(0,Integer.parseInt(input.split(" ")[1]));
			return ;
		}
		if(input.contains("push_back")) {
			deque.add(deque.size(),Integer.parseInt(input.split(" ")[1]));
			return ;
		}
		
		switch(input) {
		case "pop_front":
			if(deque.size()==0) {
				sb.append(-1).append("\n");
				return;
			}
			sb.append(deque.remove(0)).append("\n");
			return;
		case "pop_back":
			if(deque.size()==0) {
				sb.append(-1).append("\n");
				return;
			}
			sb.append(deque.remove(deque.size()-1)).append("\n");
			return;
		case "size":
			sb.append(deque.size()).append("\n");
			return;
		case "empty":
			if(deque.size()==0) {
				sb.append(1).append("\n");
				return;
			}
			sb.append(0).append("\n");
			return;
		case "front":
			if(deque.size()==0) {
				sb.append(-1).append("\n");
				return;
			}
			sb.append(deque.get(0)).append("\n");
			return;
		case "back":
			if(deque.size()==0) {
				sb.append(-1).append("\n");
				return;
			}
			sb.append(deque.get(deque.size()-1)).append("\n");
			return;
		}
	}
}
