package exercise;

public class CollatzConjecture {
	public int solution(long n) {
        int answer=0;
		for(int i=0;i<500;i++) {
			if(n==1)break;
			if(n%2==0) {
				n/=2;
			}else {
				n=n*3+1;
			}answer++;
		}if(answer==500) answer=-1;
        return answer;
    }
}
