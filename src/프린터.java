import java.util.*;

class 포인터 {

    PriorityQueue<Print> printList = new PriorityQueue<Print>();

    public int solution(int[] priorities, int location) {
        //정답의 횟수를 카운트할 변수
        int answer = 1;

        for(int i=0; i<priorities.length;i++) {
            printList.offer(new Print(i, priorities[i]));
        }


        while (!isOut) {
            if(printList.poll().getLocation() == location) {
                isOut = true;
            }
            answer++;
        }

        return answer;
    }
}

class Print implements Comparable<Print>{

    int location;
    int  priority;

    public Print(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }


    public int getLocation() {
        return this.location; 
    }

    public int getPriority() {
        return this.priority; 
    }

    public String toString() {
        return "Print [location=" + location + ", priority=" + priority + "]";
    }


    @Override
    public int compareTo(Print o) {
        // TODO Auto-generated method stub
        return o.priority -this.priority;
    }
}
