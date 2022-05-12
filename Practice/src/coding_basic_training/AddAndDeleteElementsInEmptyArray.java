package coding_basic_training;

import java.util.Stack;

public class AddAndDeleteElementsInEmptyArray {
//	빈 배열에 추가, 삭제하기
	public int[] solution(int[] arr, boolean[] flag) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					s.add(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					s.pop();
				}
			}
		}
		return s.stream().mapToInt(i -> i).toArray();
	}
}