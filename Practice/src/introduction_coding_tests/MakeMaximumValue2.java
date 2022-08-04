package introduction_coding_tests;

import java.util.Arrays;

public class MakeMaximumValue2 {
//	최댓값 만들기 (2)
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 2] * numbers[numbers.length - 1]);
	}
}