package stack_queue;

import java.util.Stack;

public class BridgeTruck {
	//28.6 / 100.0
    public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer=1;
		int start=0;
		int end=0;
		int load=0;
		Stack<Integer> s=new Stack<Integer>();
		for(int i=0;i<truck_weights.length;i++) {
			s.add(0);
		}
		while(s.lastElement()!=bridge_length) {
			answer++;
			load=0;
			int i=start;
			do {
				load+=truck_weights[i];
				s.set(i, s.get(i)+1);
				i++;
			}while(i<=end);
			if(i<s.size()&&weight>=load+truck_weights[i]) end++;
			if(s.get(start)>=bridge_length) {
				if(start==end) end++;
				start++;
			}
		}
        return answer;
    }
}
