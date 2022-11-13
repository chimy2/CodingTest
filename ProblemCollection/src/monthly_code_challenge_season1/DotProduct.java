package monthly_code_challenge_season1;

import java.util.stream.IntStream;

public class DotProduct {
//	내적
	public int solution(int[] a, int[] b) {
		return IntStream.range(0, a.length).reduce(0, (ac, i) -> ac + a[i] * b[i]);
//		int answer = 0;
//		for (int i = 0; i < a.length; i++) {
//			answer += a[i] * b[i];
//		}
//		return answer;
	}
}
