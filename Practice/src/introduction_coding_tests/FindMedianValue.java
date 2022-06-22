package introduction_coding_tests;

import java.util.Arrays;

public class FindMedianValue {
//	중앙값 구하기
	public int solution(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}
}