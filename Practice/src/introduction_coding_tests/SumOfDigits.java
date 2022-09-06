package introduction_coding_tests;

import java.util.Arrays;

public class SumOfDigits {
//	자릿수 더하기
	public int solution(int n) {
		return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
	}
}