package coding_basic_training;

import java.util.stream.IntStream;

public class ElementsWithIntervalOfN {
//	n개 간격의 원소들
	public int[] solution(int[] num_list, int n) {
		return IntStream.range(0, num_list.length / n + (num_list.length % n != 0 ? 1 : 0)).map(i -> num_list[i * n])
				.toArray();
	}
}