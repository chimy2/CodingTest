package introduction_coding_tests;

import java.util.Arrays;

public class DoubleArray {
//	배열 두 배 만들기
	public int[] solution(int[] numbers) {
		return Arrays.stream(numbers).map(i -> i * 2).toArray();
	}
}