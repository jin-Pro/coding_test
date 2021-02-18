package Stage_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8 {
	static int answer = Integer.MAX_VALUE;
	static int[][] point ;
	static int peopleNum ;
	static boolean[] team;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		peopleNum = Integer.parseInt(br.readLine());
		
		point = new int[peopleNum][peopleNum];
		
		team = new boolean[peopleNum];
		
		for(int i = 0; i < peopleNum ; i++) {
			String inputLine = br.readLine();
			String[] inputSplit = inputLine.split(" ");
			for(int j = 0; j < peopleNum; j++) {
				point[i][j] = Integer.parseInt(inputSplit[j]);
			}
		}
		
		calculator(0,0);
		
		System.out.println(answer);
	}
	
	public static void calculator(int memberCount, int start) {
		if(memberCount == peopleNum / 2) {
			compareAnswer();
			return;
		}
		
		for(int i = start; i < peopleNum; i++) {
			if(!team[i]) {
				team[i] = true;
				calculator(memberCount+1,start+1);
				team[i] = false;
			}
		}
	}
	
	public static void compareAnswer() {
		int start = 0;
		int link = 0; 
		
		for(int i = 0 ; i < team.length - 1 ; i++) {
			for(int j = i + 1; j < team.length; j++) {
				if(team[i] && team[j]) {
					start += point[i][j];
					start += point[j][i];
				}
				
				if(!team[i] && !team[j]) {
					link += point[i][j];
					link += point[j][i];
				}
			}
		}
		int dif = Math.abs(start-link);
		
		if(dif == 0) {
			System.out.println(0);
			System.exit(0);
		}
		answer = Math.min(answer, dif); 
	}
}
