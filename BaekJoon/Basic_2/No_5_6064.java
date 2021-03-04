package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_5_6064 {
	static int M;
	static int N;
	static int arriveX;
	static int arriveY;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			
			arriveX = Integer.parseInt(st.nextToken());
			arriveY = Integer.parseInt(st.nextToken());
			
			solve();
		}
		System.out.println(sb);
		
	}
	
	private static void solve() {
		int count = arriveX;
		int lcm = lcm(M,N);
		int startY = arriveX;
		
		for(int i = 0; i < N; i++) {
			int sy = startY % N == 0 ? N : startY % N;
            if (sy == arriveY) {
                break;
            }

            startY = sy + M;
			count += M;		
		}
		if(count > lcm) {
			count = -1;
		}
		sb.append(count).append("\n");
	}
	
	static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    static int gcd(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
	
}
