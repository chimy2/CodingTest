package heap;

import java.util.PriorityQueue;

public class Spicier {
    public int solution(int[] scoville, int K) {
		int answer=0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<scoville.length;i++) {
			pq.add(scoville[i]);
		}
		while(pq.peek()<K) {
			pq.add(pq.poll()+pq.poll()*2);
			answer++;
			if(pq.size()==1 && pq.peek()<K) {
				answer=-1;
				break;
			}
		}
        return answer;
    }
}
