package coding_basic_training;

public class SequenceAndRangeQuery1 {
//	수열과 구간 쿼리1
	public int[] solution(int[] arr, int[][] queries) {
		for (int[] q : queries) {
			for (int i = q[0]; i <= q[1]; i++) {
				arr[i]++;
			}
		}
		return arr;
	}
}