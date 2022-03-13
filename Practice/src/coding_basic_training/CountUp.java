package coding_basic_training;

import java.util.stream.IntStream;

public class CountUp {
//	카운트 업
	public int[] solution(int start, int end) {
		return IntStream.range(start, end + 1).toArray();
//		return IntStream.rangeClosed(start, end).toArray();
	}
}
