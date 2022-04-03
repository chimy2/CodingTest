package coding_basic_training;

import java.util.stream.IntStream;

public class Countdown {
//	카운트 다운
	public int[] solution(int start, int end) {
		return IntStream.rangeClosed(start, end).map(i -> end - i + start).toArray();
//        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
	}
}