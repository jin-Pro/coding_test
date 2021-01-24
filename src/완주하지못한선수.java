import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 완주하지못한선수 {
	public String solution(String[] participant, String[] completion) {

		List<String> participant1 = new ArrayList<String>(Arrays.asList(participant));
		for(int i = 0; i < completion.length; i++) {
			for(int j = 0; j < participant.length; j++) {
				if(completion[i].equals(participant[j])) {
					participant1.remove(participant[j]);
				}
			}
		}
        return (String)participant1.get(0);
    }
}
