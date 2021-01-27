import java.util.ArrayList;

public class 같은숫자는싫어 {
	public static ArrayList solution(int []arr) {
		ArrayList answer = new ArrayList();
        int j = 1;
        answer.add(arr[0]);
        for(int i = 1; i<arr.length; i++){

            if((int)(answer.get(j-1)) != arr[i]){
                j++;
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}
