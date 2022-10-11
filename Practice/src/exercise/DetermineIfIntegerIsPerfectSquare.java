package exercise;

public class DetermineIfIntegerIsPerfectSquare {
//	정수 제곱근 판별
	public long solution(long n) {
		return (long) Math.sqrt(n) == Math.sqrt(n) ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
//		long answer = 0;
//		double n2 = Math.sqrt(n);
//		answer = n2 - (long) n2 > 0 ? -1 : (long) Math.pow(n2 + 1, 2);
//		return answer;
	}
}