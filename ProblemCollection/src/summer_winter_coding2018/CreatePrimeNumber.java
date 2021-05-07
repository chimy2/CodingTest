package summer_winter_coding2018;

public class CreatePrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] arr=new boolean[3001];
        for(int i=0;i<arr.length;i++) {
            if(i<2) arr[i]=true;
            else if(!arr[i]) {
                for(int j=2;i*j<=3000;j++) {
                    arr[i*j]=true;
                }
            }
        }
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(!arr[nums[i]+nums[j]+nums[k]]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
