package introduction_coding_tests;

public class ThrowBall {
//	공 던지기
	public int solution(int[] numbers, int k) {
		return numbers[(k - 1) * 2 % numbers.length];
//		return (k - 1) * 2 % numbers.length + 1;
	}
}