package introduction_coding_tests;

public class DetermineIfItIsPerfectSquare {
//	제곱수 판별하기
	public int solution(int n) {
		return Math.sqrt(n) == (float) Math.sqrt(n) ? 1 : 2;
//        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
	}
}