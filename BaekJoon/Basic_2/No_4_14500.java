package Level_Basic_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_4_14500 {
	
	static int[][] board;
	static boolean[][] visit;
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		board = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M ; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				
				visit[i][j] = true;
				answer = Math.max(answer, solve(0,i,j,0));
				visit[i][j] = false;
			}
		}
		
		System.out.println(answer);
	}
	
	private static int solve(int depth,int row, int col,int answer) {
		if(depth == 4) {
			return answer;
		}
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		
		if(col+1 < M && !visit[row][col+1]) {
			visit[row][col+1] = true;
			a = solve(depth+1,row,col+1,answer + board[row][col]);
			visit[row][col+1] = false;
		}
		if(col - 1 >= 0 && !visit[row][col-1]) {
			visit[row][col-1] = true;
			b = solve(depth+1,row,col-1,answer + board[row][col]);
			visit[row][col-1] = false;
		}
		if(row + 1 < N && !visit[row+1][col] ) {
			visit[row+1][col] = true;
			c = solve(depth+1,row+1,col,answer + board[row][col]);
			visit[row+1][col] = false;
		}
		if(row - 1 >= 0 && !visit[row-1][col]) {
			visit[row-1][col] = true;
			d = solve(depth+1,row-1,col,answer + board[row][col]);
			visit[row-1][col] = false;
		}
		if(depth == 0 && row + 2 < N && col -1 >= 0 && !visit[row+1][col] && !visit[row+2][col] && !visit[row+1][col-1]) {
			e = board[row][col] + board[row+1][col] + board[row+2][col] + board[row+1][col-1];
		}
		if(depth == 0 && row + 2 < N && col + 1 < M && !visit[row+1][col] && !visit[row+2][col] && !visit[row+1][col+1]) {
			f = board[row][col] + board[row+1][col] + board[row+2][col] + board[row+1][col+1];
		}
		if(depth == 0 && row -1 >= 0 && col + 2 < M && !visit[row][col+1] && !visit[row][col+2] && !visit[row-1][col+1]) {
			g = board[row][col] + board[row][col+1] + board[row][col+2] + board[row-1][col+1];
		}
		if(depth == 0 && row +1 < N && col + 2 < M && !visit[row][col+1] && !visit[row][col+2] && !visit[row+1][col+1]) {
			h = board[row][col] + board[row][col+1] + board[row][col+2] + board[row+1][col+1];
		}
		return Math.max(Math.max(Math.max(a, b), Math.max(c, d)), Math.max(Math.max(e, f), Math.max(g, h)));
	}
}
