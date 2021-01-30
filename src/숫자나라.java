
public class 숫자나라 {
	public String solution(int n) {
		String[] number = {"1","2","4"};
        String answer = "";
        while(n != 0) {
        	switch((n-1)%3) {
        	case 0:
        		answer = number[0].concat(answer);
        		break;
        	case 1:
        		answer = number[1].concat(answer);
        		break;
        	case 2:
        		answer = number[2].concat(answer);
        		break;
        	}
        	n = (n-1) / 3 ;
        }
        return answer;
    }
}
