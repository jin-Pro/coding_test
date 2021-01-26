
public class 가운데글자가져오기 {
    public String solution(String s) {    
        int stLength = s.length();
        char[] answer;
        
        if(stLength % 2 == 0){
            answer = new char[2];
            answer[0] = s.charAt(stLength/2 -1);
            answer[1] = s.charAt(stLength/2);
        }else{
            answer = new char[1];
            answer[0] =  s.charAt(stLength/2);
        }
        
        return String.valueOf(answer);
    }
}
