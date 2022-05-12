package coding_basic_training;

import java.util.Stack;

public class CreateArray6 {
//	배열 만들기6
	public int[] solution(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (s.size() == 0 || s.peek() != arr[i]) {
				s.add(arr[i]);
			} else if (s.peek() == arr[i]) {
				s.pop();
			}
		}
		return s.size() > 0 ? s.stream().mapToInt(i -> i).toArray() : new int[] { -1 };
	}
}