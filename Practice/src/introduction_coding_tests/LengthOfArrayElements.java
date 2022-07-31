package introduction_coding_tests;

import java.util.Arrays;

public class LengthOfArrayElements {
//	배열 원소의 길이{
	public int[] solution(String[] strlist) {
		return Arrays.stream(strlist).mapToInt(i -> i.length()).toArray();
	}
}