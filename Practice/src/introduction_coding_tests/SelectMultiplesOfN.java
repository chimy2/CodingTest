package introduction_coding_tests;

import java.util.Arrays;

public class SelectMultiplesOfN {
//	n의 배수 고르기
	public int[] solution(int n, int[] numlist) {
		return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
	}
}