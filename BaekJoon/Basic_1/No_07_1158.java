package Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_07_1158 {
	static Stack<Integer> list = new Stack<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		String[] inputSplit = input.split(" ");
		
		int num = Integer.parseInt(inputSplit[0]);
		int deleteNum = Integer.parseInt(inputSplit[1]);
		int delete = deleteNum -1 ;
		
		for(int i = 1; i <= num; i++) {
			list.add(i);
		}
		
		sb.append("<").append(list.remove(delete));
		delete += (deleteNum -1);
		
		while(list.size()!=0) {
			if(delete > list.size()) delete = delete % list.size();
			sb.append(", " + list.remove(delete));
			delete += (deleteNum -1);
		}
		
		sb.append(">");
		
		System.out.println(sb);
	}
}
