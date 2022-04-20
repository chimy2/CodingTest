package coding_basic_training;

import java.util.Arrays;

public class TransformSequenceBasedOnCertainConditions1 {
//	조건에 맞게 수열 변환하기1
	public int[] solution(int[] arr) {
		return Arrays.stream(arr).map(i -> i % 2 == 0 ? (i < 50 ? i : i / 2) : (i < 50 ? i * 2 : i)).toArray();
	}
}
