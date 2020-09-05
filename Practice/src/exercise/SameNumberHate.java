package exercise;
import java.util.*;

public class SameNumberHate {
	public int[] solution(int []arr) {
		int[] answer={arr[0]};
		int num=0;
		
		for(int i=1;i<arr.length;i++) {
			System.out.println("answer="+answer[num]+", arr="+arr[i]);
			if(answer[num]!=arr[i]) {
				answer=Arrays.copyOf(answer, answer.length+1);
				answer[++num]=arr[i];
			}
		}
        return answer;
    }
}
