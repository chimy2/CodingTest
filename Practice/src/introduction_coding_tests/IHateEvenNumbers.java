package introduction_coding_tests;

import java.util.stream.IntStream;

public class IHateEvenNumbers {
//	짝수는 싫어요
	public int[] solution(int n) {
		return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
	}
}