package coding_basic_training;

import java.util.ArrayList;

public class AddBasedOnElementsInArray {
//	배열의 원소만큼 추가하기
	public int[] solution(int[] arr) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int v = arr[i];
			for (int j = 0; j < v; j++) {
				li.add(v);
			}
		}
		return li.stream().mapToInt(i -> i).toArray();
	}
}