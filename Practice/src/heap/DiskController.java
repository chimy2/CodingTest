package heap;

import java.util.Arrays;
import java.util.Comparator;

public class DiskController {
    public int solution(int[][] jobs) {
        int time=0;
        int answer=0;
        boolean[] arr=new boolean[jobs.length];
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) {
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });

        for(int i=0;i<jobs.length;i++) {
            int min=-1;
            for(int j=0;j<jobs.length&&jobs[j][0]<=time;j++) {
                if(!arr[j] && (
                        min==-1 || jobs[j][1]<jobs[min][1])){
                    min=j;
                }
            }
            if(min==-1) {
                time++;
                i--;
                continue;
            }
            arr[min]=true;
            answer+=time+jobs[min][1]-jobs[min][0];
            time+=jobs[min][1];
        }
        return answer/jobs.length;
    }
}
