package introduction_coding_tests;

import java.util.Arrays;

public class AverageValueOfArray {
//	배열의 평균값
	public double solution(int[] numbers) {
		return (float) Arrays.stream(numbers).sum() / numbers.length;
//		return Arrays.stream(numbers).average().orElse(0);
	}
}