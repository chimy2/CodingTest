package coding_basic_training;

import java.util.stream.IntStream;

public class FromNthElement {
//	n 번째 원소부터
	public int[] solution(int[] num_list, int n) {
		return IntStream.rangeClosed(n - 1, num_list.length - 1).map(i -> num_list[i]).toArray();
	}
}
