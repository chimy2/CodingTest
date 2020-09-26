package exercise;

public class GreatestCommonDivisorAndLeastCommonMultiple {
    public int[] solution(int n, int m) {
        int[] nm= {n,m};
		int[] answer= {1,1};
		for(int i=2;i<=Math.max(nm[0], nm[1]);) {
			if(n%i==0&&m%i==0) {
				n/=i;
				m/=i;
				answer[0]*=i;
			}else {
				i++;
			}
		}
		answer[1]=nm[0]*nm[1]/answer[0];
        return answer;
    }
}
