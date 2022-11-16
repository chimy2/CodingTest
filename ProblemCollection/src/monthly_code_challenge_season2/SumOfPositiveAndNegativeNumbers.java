package monthly_code_challenge_season2;

import java.util.stream.IntStream;

public class SumOfPositiveAndNegativeNumbers {
//	음양 더하기
	public int solution(int[] absolutes, boolean[] signs) {
		return IntStream.range(0, absolutes.length).reduce(0, (ac, i) -> ac + absolutes[i] * (signs[i] ? 1 : -1));
//		int answer = 0;
//		for (int i = 0; i < absolutes.length; i++) {
//			answer += signs[i] ? absolutes[i] : -absolutes[i];
//		}
//		return answer;
	}
}