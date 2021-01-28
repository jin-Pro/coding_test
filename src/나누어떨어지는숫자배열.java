import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
	public static ArrayList solution(int[] arr, int divisor) {
		ArrayList answer = new ArrayList();
        int j = 0;
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }
        
        if(answer.size() == 0){
            answer.add(-1);
            
            return answer;
        }
        
        Collections.sort(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		System.out.println(solution(arr,divisor));
		
	}
}
