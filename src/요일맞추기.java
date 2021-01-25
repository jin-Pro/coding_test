public class 요일맞추기 {
	public String solution(int a, int b) {
        String answer = "";
        String[] dayOfTheWeek = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int day = b;
        
        switch(a){
            case 1,2,3,4,5,6,7,8:
                day += 31 * (a/2);
                if(a >= 3){
                    day += (30 * ((a-3)/2) + 29);
                }
                break;
            case 9,10,11,12:
            	day += 31 * ((a+1)/2);
            	day += (30 * ((a-4)/2) + 29);
            	break;
        }
        while(day<7) {
        	day /= 7;
        }
        answer = dayOfTheWeek[day/7];
        return answer;
    }
}
