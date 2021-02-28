package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_28_10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(facto(num));
	}

	private static int facto(int num) {
		// TODO Auto-generated method stub
		if(num == 0) return 1;
		return num * facto(num-1);
	}
}
