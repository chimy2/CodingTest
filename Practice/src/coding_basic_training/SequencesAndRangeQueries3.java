package coding_basic_training;

public class SequencesAndRangeQueries3 {
//	수열과 구간 쿼리3
	public int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
			swap(arr, queries[i][0], queries[i][1]);
		}
		return arr;
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
