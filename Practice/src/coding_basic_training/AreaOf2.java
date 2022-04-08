package coding_basic_training;

import java.util.Stack;

public class AreaOf2 {
//	2의 영역
	public int[] solution(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		boolean checked = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				checked = true;
			}
			if (checked) {
				s.add(arr[i]);
			}
		}
		while (!s.empty() && s.peek() != 2) {
			s.pop();
		}
		return !s.empty() ? s.stream().mapToInt(i -> i).toArray() : new int[] { -1 };
	}
}