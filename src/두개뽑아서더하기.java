import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class �ΰ��̾Ƽ����ϱ� {
	public ArrayList solution(int[] numbers) {
		ArrayList answer = new ArrayList();
		int sum = 0;
		
		for(int i = 0; i<numbers.length-1; i++) {
			for(int j = i+1 ; j<numbers.length; j++) {
				sum = numbers[i] + numbers[j] ;
				answer.add(sum);
			}
		}
		
		HashSet answerHash = new HashSet(answer);
		answer = new ArrayList(answerHash);
        
		Collections.sort(answer);
		
        return answer;
    }
}
