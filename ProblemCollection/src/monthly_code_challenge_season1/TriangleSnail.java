package monthly_code_challenge_season1;

public class TriangleSnail {
    public int[] solution(int n) {
		int[] answer=new int[n*(n+1)/2];
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				int index=0;
				switch(i%3) {
				case 0:
					index=(j+i/3*2)*(j+i/3*2+1)/2+i/3;
					break;
				case 1:
					index=(n-i/3-1)*(n-i/3)/2+i/3+j+1;
					break;
				case 2:
					index=(n-i/3-j-1)*(n-i/3-j)/2-i/3-1;
					break;
				}
				answer[index]=num++;
			}
		}
        return answer;
    }
}
