package coding_basic_training;

import java.util.Arrays;

public class AddUntilItExceedsN {
//	n보다 커질 때까지 더하기
	public int solution(int[] numbers, int n) {
		return Arrays.stream(numbers).reduce((x, y) -> x <= n ? x + y : x).orElse(0);
	}
}
