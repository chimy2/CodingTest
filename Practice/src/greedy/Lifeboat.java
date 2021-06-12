package greedy;

import java.util.Arrays;

public class Lifeboat {
	public static void main(String[] args) {
		int[] people={70, 50, 80, 50};
		int limit=100;

        int answer = 0;
        int min=-1;
        boolean[] arr=new boolean[people.length];
        Arrays.sort(people);
        for(int i=0;people[i]<=limit/2 && i<people.length-1;i++) min=i;
        System.out.println(min);
        for(int i=people.length-1;i>min;i--) {
            int index=-1;
            for(int j=0;j<i;j++) {
                if(!arr[j]) {
                    if(people[i]+people[j]>limit) {
                        break;
                    } else if(people[i]+people[j]<=limit) {
                        index=j;
                    }
                } 
            }
            if(index!=-1) {
                arr[index]=true;
            } 
            if(!arr[i]) {
                answer++;
            }
        }
        System.out.println(answer+min/2);
	}
}
