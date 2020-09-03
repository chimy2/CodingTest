package stack_queue;

import java.util.Arrays;

public class FunctionalDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int complete=0,check=0;
		for(int i=0;complete<progresses.length;) {
			for(int j=complete;j<progresses.length;j++) {
				if(progresses[j]+speeds[j]<100) {
					progresses[j]+=speeds[j];
				}else {
					progresses[j]=100;
				}
				if(progresses[complete]==100) {
					complete++;
					check++;
				}
			}
			if(check!=0) {
				answer=Arrays.copyOf(answer, answer.length+1);
				answer[i]=check;
				check=0;
				i++;
			}
		}
        return answer;
    }
}
