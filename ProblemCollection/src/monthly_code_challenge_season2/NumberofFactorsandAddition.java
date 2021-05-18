package monthly_code_challenge_season2;

public class NumberofFactorsandAddition {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++) {
            int count=1;
            for(int j=2;j<=i;j++){
                if(i%j==0) count++;
            }
            answer+=count%2==0 ? i : -i;
        }
        return answer;
    }
}
