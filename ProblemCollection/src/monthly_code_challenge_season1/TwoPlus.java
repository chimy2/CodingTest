package monthly_code_challenge_season1;

import java.util.Arrays;
import java.util.HashSet;

public class TwoPlus {
    public int[] solution(int[] numbers) {
		HashSet<Integer> hs=new HashSet<Integer>();
        int i=0;
		for(;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				hs.add(numbers[i]+numbers[j]);
			}
		}
        int[] answer =new int[hs.toArray().length];
        i=0;
        for(Object x:hs.toArray()){
            answer[i++]=(int)x;
        }
        Arrays.sort(answer);
        return answer;
    }
}
