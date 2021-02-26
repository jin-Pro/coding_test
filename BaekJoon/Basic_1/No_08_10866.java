package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//push_front X: ���� X�� ���� �տ� �ִ´�.
//push_back X: ���� X�� ���� �ڿ� �ִ´�.
//pop_front: ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//pop_back: ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ���� ����ִ� ������ ������ ����Ѵ�.
//empty: ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
//front: ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

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
