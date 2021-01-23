import java.util.ArrayList;

public class 크레인인형뽑기 {
	public int solution(int[][] board, int[] moves) {
        int target = 0;
        int answer = 0;
        
        ArrayList stack = new ArrayList(); 
        
        for(int i = 0; i < moves.length; i++){
            target = moves[i]-1;
            
            for(int j = board[target].length - 1; j >= 0; j--){
                if(board[target][j] != 0){
                    stack.add(board[target][j]);
                    board[target][j] = 0;
                    break;
                }
            }
        }
        for(int i = 0; i<moves.length/2; i++){
            for(int j = 0; j<stack.size(); j++){
                if(stack.get(j) == stack.get(j+1)){
                    answer += 2;
                    stack.remove(j+1);
                    stack.remove(j);
                    break;
                }
            }    
        }
        
        return answer;
    }
}