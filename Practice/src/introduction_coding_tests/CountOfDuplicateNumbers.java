package introduction_coding_tests;

import java.util.Arrays;

public class CountOfDuplicateNumbers {
//	중복된 숫자 개수
	public int solution(int[] array, int n) {
		return (int) Arrays.stream(array).filter(i -> i == n).count();
	}
}