package introduction_coding_tests;

import java.util.stream.IntStream;

public class FindDivisors {
//	약수 구하기
	public int[] solution(int n) {
		return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
	}
}