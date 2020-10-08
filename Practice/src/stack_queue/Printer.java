package stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer=0;
		int max=0;
		Object[] arr;
		Queue q=new ArrayDeque<String>();
		for(int i=0;i<priorities.length;i++) {
			q.add(priorities[i]+" "+i);
		}
		while(true){
			int importance=Character.getNumericValue(q.peek().toString().charAt(0));
			arr=q.toArray();
			max=importance;
			for(int i=0;i<arr.length;i++) {
				int j=Character.getNumericValue(((String) arr[i]).charAt(0));
				if(max<j) {
					max=j;
					break;
				}
			}
			if(importance<max) {
				q.add(q.poll());
			}else {
				answer++;
				if(location==Integer.parseInt(q.peek().toString().substring(2))) {
					return answer;
				}q.poll();
			}
		}
    }
}
