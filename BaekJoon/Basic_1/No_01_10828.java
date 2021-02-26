package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No_01_10828 {
//	push X: ���� X�� ���ÿ� �ִ� �����̴�.
//	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
//	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//	top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
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
