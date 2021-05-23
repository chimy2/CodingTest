package kakao_blind_recruitment2019;

import java.util.Arrays;
import java.util.Comparator;

public class FailureLate {
    public Integer[] solution(int N, int[] stages) {
        Integer[] answer = new Integer[N];
        float[] arr=new float[N];
        Arrays.sort(stages);
        for(int i=1;i<=N;i++){
            int clear=0;
            int fail=0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]==i) fail++;
                if(stages[j]>=i) clear++; 
            }
            arr[i-1]=clear==0? 0 : (float)fail/clear;
            answer[i-1]=i;
        }
        Arrays.sort(answer, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(arr[o1-1]<=arr[o2-1]) {
					return 1;
				} else {
					return -1;
				}
			}
		});
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
		FailureLate f=new FailureLate();
		f.solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3});
		f.solution(4,new int[]{4, 4, 4, 4, 4});
		f.solution(2,new int[]{1,1});
	}
}
