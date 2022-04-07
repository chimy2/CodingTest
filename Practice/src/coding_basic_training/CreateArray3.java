package coding_basic_training;

import java.util.ArrayList;

public class CreateArray3 {
//	배열 만들기3
	public int[] solution(int[] arr, int[][] intervals) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				li.add(arr[j]);
			}
		}
		return li.stream().mapToInt(i -> i).toArray();
	}
}