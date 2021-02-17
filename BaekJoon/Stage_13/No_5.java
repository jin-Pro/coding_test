package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5 {
	
	static int width = 9;
	static int height = 9;
	static int[][] board = new int[width][height];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < width; i++) {
			String input = br.readLine();
			String[] inputSplit = input.split(" ");
			for(int j = 0; j < height; j++) {
				board[i][j] = Integer.parseInt(inputSplit[j]);
			}
		}
		
		searchNumber(0,0);
	}
	
	public static void searchNumber(int row,int col) {
		if(col == width){
			searchNumber(row+1,0);
			return;
		}
		
		if(row == height) {
			printNumber();
		}
		
		if(board[row][col] == 0) {
			for(int k = 1; k <= width; k++) {	
				
				if(checkBoard(row,col,k)) {
					board[row][col] = k;
					searchNumber(row,col + 1);					
				}				
			}
			board[row][col] = 0;
			return;
		}
		searchNumber(row,col + 1);
	}
	
	public static boolean checkBoard(int row, int col,int compare) {
		for(int i = 0; i < width; i ++) {
			if(board[i][col] == compare) {
				return false;
			}
		}

		for(int i = 0; i < height; i++) {
			if(board[row][i] == compare) {
				return false;
			}
		}
		
		int areaWidth = (row / 3) * 3;
		int areaHeight = (col / 3) * 3;
		
		for(int i = areaWidth; i < areaWidth + 3; i++) {
			for(int j = areaHeight; j < areaHeight + 3; j++) {
				if(compare == board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void printNumber() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < width; i++) {
			for(int j = 0; j < height; j++) {
				sb.append(board[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
		System.exit(0);
	}
}
