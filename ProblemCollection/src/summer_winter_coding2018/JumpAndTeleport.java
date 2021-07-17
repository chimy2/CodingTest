package summer_winter_coding2018;

public class JumpAndTeleport {
    public int solution(int n) {
        int answer=0;
		while(n!=0) {
			if(n%2==0) {
				n/=2;
			} else {
				n--;
				answer++;
			}
		}
        return answer;
    }
}
