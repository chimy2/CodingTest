package exercise;
import java.util.*;

public class SameNumberHate {
	public int[] solution(int []arr) {
		int[] answer=new int[2];
		int num=0;
		
		for(int i=1;i<arr.length;i++) {
			if(answer[num]!=arr[i]) {
				answer[++num]=arr[i];
			}
		}
        return answer;
    }
}
