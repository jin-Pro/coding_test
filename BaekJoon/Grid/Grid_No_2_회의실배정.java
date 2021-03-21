package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_No_2_회의실배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int meetingCount = sc.nextInt();
		
		Meet[] meeting = new Meet[meetingCount];
		
		for(int i = 0; i < meetingCount ; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			meeting[i] = new Meet(start,end);
		}
		
		Arrays.sort(meeting);
		
		int answer = 0;
		int beginMeetTime = 0;
		
		for( int i = 0; i < meetingCount ; i++) {
			if(beginMeetTime <= meeting[i].start) {
				beginMeetTime = meeting[i].end;
				answer++;
			}
		}
		
		System.out.println(answer);
		return ;
	}
}

class Meet implements Comparable<Meet> {
	int start;
	int end;
	
	Meet(int start, int end){
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meet meet) {
		// TODO Auto-generated method stub
		if(this.end == meet.end) {
			return this.start - meet.start;
		}
		return this.end - meet.end;
	}
}