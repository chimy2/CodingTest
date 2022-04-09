package coding_basic_training;

import java.util.Arrays;

public class SliceArray {
//	배열 조각하기
	public int[] solution(int[] arr, int[] query) {
		int start = 0;
		int end = arr.length - 1;
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				end = query[i] + start;
			} else {
				start += query[i];
			}
		}
		return Arrays.copyOfRange(arr, start, end + 1);
	}
}