package monthly_code_challenge_season1;

public class Flip3Base {
    public int solution(int n) {
        int answer=n;
        int count=0;
        String s="";
        while(Math.pow(3, count)<n) count++;
        for(int i=0;i<count;i++){
            s+=answer%3+"";
            answer/=3;
        }
        for(int i=0;i<count;i++){
            int j=Character.getNumericValue(s.charAt(i));
            answer+=j*Math.pow(3, count-i-1);
        }
        return answer;
    }
}
