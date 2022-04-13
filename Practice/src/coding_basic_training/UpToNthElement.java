package coding_basic_training;

import java.util.Arrays;

public class UpToNthElement {
//	n 번째 원소까지
	public int[] solution(int[] num_list, int n) {
		return Arrays.copyOfRange(num_list, 0, n);
	}
}
