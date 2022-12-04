package exercise;

public class ColaProblem {
//	콜라 문제
	public int solution(int a, int b, int n) {
		int answer = 0;
		while (a <= n) {
			answer += n / a * b;
			n = n % a + n / a * b;
		}
		return answer;
//		return (n - a) / (a - b) * b;
	}
}