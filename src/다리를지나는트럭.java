import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridgeWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int t : truck_weights) {
        	while(true) {
        		if(bridge.isEmpty()) {
        			bridge.add(t);
        			bridgeWeight += t;
        			answer++;
        			break;
        		}else if(bridge.size() == bridge_length) {
        			bridgeWeight -= bridge.remove();
        		}else {
        			if(bridgeWeight + t > weight) {
        				bridge.add(0);
        				answer++;
        			}else {
        				bridge.add(t);
        				answer++;     
                        bridgeWeight += t;
        				break;
        			}
        			
        		}
        	}
        }
        return answer + bridge_length;
    }
}
