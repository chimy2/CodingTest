package introduction_coding_tests;

import java.util.stream.IntStream;

public class SumOfConsecutiveNumbers {
//	연속된 수의 합
	public int[] solution(int num, int total) {
		return IntStream.rangeClosed(total / num - (num - 1) / 2, total / num + num / 2).toArray();
	}
}