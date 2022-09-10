package introduction_coding_tests;

public class BacterialGrowth {
//	세균 증식
	public int solution(int n, int t) {
		return n * (int) Math.pow(2, t);
//		return n << t;
	}
}