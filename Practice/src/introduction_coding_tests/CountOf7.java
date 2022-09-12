package introduction_coding_tests;

import java.util.Arrays;

public class CountOf7 {
//	7의 개수
	public int solution(int[] array) {
		return (int) Arrays
				.stream(Arrays.stream(array).mapToObj(String::valueOf).reduce("", (ac, c) -> ac + c).split(""))
				.filter(i -> i.equals("7")).count();
	}
}