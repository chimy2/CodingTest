package introduction_coding_tests;

public class AdditionOfFractions {
//	분수의 덧셈
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = { numer1 * denom2 + numer2 * denom1, denom1 * denom2 };
		for (int i = 2; i < answer[0] || i < answer[1];) {
			if (answer[0] % i == 0 && answer[1] % i == 0) {
				answer[0] /= i;
				answer[1] /= i;
			} else {
				i++;
			}
		}
		return answer;
	}
}