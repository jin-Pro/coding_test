package Level_Basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_20_10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String first = st.nextToken();
		first += st.nextToken();
		String second = st.nextToken();
		second += st.nextToken();
		
		System.out.println(Long.parseLong(first)+ Long.parseLong(second));
	}
}
