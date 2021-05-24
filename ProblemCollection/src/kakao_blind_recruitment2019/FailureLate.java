package kakao_blind_recruitment2019;

import java.util.Arrays;

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
        
        float[] arr2=Arrays.copyOf(arr, N);
        Arrays.sort(arr2);
        for(int i=0;i<N;i++) {
        	for(int j=0;j<N;j++) {
            	if(arr2[N-i-1]==arr[j]) {
            		arr[j]=-1;
            		answer[i]=j+1;
            		break;
            	}
        	}
        }
        return answer;
    }
}
