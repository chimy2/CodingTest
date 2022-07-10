package introduction_coding_tests;

import java.util.Arrays;

public class CutArray {
//	배열 자르기
	public int[] solution(int[] numbers, int num1, int num2) {
		return Arrays.copyOfRange(numbers, num1, num2 + 1);
	}
}