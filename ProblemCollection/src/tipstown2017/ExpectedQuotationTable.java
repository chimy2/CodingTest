package tipstown2017;

public class ExpectedQuotationTable {
//	예상 대진표
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(true) {
			answer++;
			if(a%2==1) a++;
			if(b%2==1) b++;
			if(a==b) break;
			a/=2;
			b/=2;
		}
        return answer;
    }
}
