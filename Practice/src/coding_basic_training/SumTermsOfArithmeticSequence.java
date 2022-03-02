package coding_basic_training;

public class SumTermsOfArithmeticSequence {
//	등차수열의 특정한 항만 더하기
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;
		for (int i = 0; i < included.length; i++) {
			if (included[i])
				answer += a + d * i;
		}
		return answer;
//		intstream을 이용한 방법
//		return IntStream.range(0, included.length).map(idx -> included[idx] ? a + (idx * d) : 0).sum();
	}
}
