package coding_basic_training;

import java.util.Arrays;

public class TransformSequenceBasedOnCertainConditions3 {
//	조건에 맞게 수열 변환하기3
	public int[] solution(int[] arr, int k) {
		int[] answer = {};
		return Arrays.stream(arr).map(i -> k % 2 == 1 ? i * k : i + k).toArray();
	}
}