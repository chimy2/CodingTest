package greedy;

import java.util.Arrays;

public class Lifeboat {
    public int solution2(int[] people, int limit) {
    	int answer=0;
    	int min=0;
        Arrays.sort(people);
    	for(int i=people.length-1;i>=min;i--) {
    		if(people[i]+people[min]<=limit) min++; 
    		answer++;
    	}
    	return answer;
    }
    
//	90.0 / 100.0
    public int solution(int[] people, int limit) {
        float answer=0;
        boolean[] arr=new boolean[people.length];
        Arrays.sort(people);
        for(int i=people.length-1;i>=0;i--) {
            if(people[i]<=limit/2) {
                for(int j=0;j<=i;j++) {
                    if(!arr[j]) answer+=0.5;
                }
                break;
            }
            for(int j=0;j<=i;j++) {
                if(!arr[j]) {
                    if(people[i]+people[j]<=limit) {
                        arr[j]=true;
                    }
                    answer++;
                    break;
                }
            }
        }
        return (int) Math.ceil(answer);
    }
}
