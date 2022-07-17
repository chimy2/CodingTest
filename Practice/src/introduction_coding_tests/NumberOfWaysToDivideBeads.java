package introduction_coding_tests;

import java.math.BigInteger;

public class NumberOfWaysToDivideBeads {
//	구슬을 나누는 경우의 수
	public int solution(int balls, int share) {
		BigInteger answer = new BigInteger("1");
		for (int i = balls; i > share; i--) {
			answer = answer.multiply(new BigInteger(i + ""));
		}
		for (int i = share - 1; i > 1; i--) {
			answer = answer.divide(new BigInteger(i + ""));
		}
		return answer.intValue();
	}

//	public long solution(int balls, int share) {
//		share = Math.min(balls - share, share);
//
//		if (share == 0)
//			return 1;
//
//		long result = solution(balls - 1, share - 1);
//		result *= balls;
//		result /= share;
//
//		return result;
//	}

}