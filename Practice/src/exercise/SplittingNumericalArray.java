package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SplittingNumericalArray {
	//나누어 떨어지는 숫자 배열 
    public int[] solution(int[] arr, int divisor) {
        List<Integer> before=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				before.add(arr[i]);
			}
		}
		Collections.sort(before);
		int[] answer=new int[before.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=before.get(i);
		}
        return answer.length>0?answer:new int[]{-1};
    }
}
