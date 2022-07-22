package introduction_coding_tests;

import java.util.stream.IntStream;

public class RotateArray {
//	배열 회전시키기
	public int[] solution(int[] numbers, String direction) {
		int n = numbers.length;
		return IntStream.range(0, numbers.length)
				.map(i -> direction.equals("left") ? numbers[(2 * n + i + 1) % n] : numbers[(2 * n + i - 1) % n])
				.toArray();
	}
}