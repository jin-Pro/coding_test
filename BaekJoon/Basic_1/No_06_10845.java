package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//push X: ���� X�� ť�� �ִ� �����̴�.
//pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//size: ť�� ����ִ� ������ ������ ����Ѵ�.
//empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
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
