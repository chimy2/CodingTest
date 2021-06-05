package exercise;

public class LeastCommonMultipleofN {
    public int solution(int[] arr) {
        int answer=1;
        for(int i=2;;) {
            int count=0;
            boolean check=false;
            for(int j=0;j<arr.length;j++) {
                if(arr[j]%i==0) {
                    arr[j]/=i;
                    check=true;
                }
                if(arr[j]==1) count++;
            }
            if(check) answer*=i;
            else i++;
            if(count==arr.length) break;
        }
        return answer;
    }
}
