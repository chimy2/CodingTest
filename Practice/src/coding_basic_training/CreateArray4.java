package coding_basic_training;

import java.util.Stack;

public class CreateArray4 {
//	배열 만들기4
	public int[] solution(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < arr.length;) {
			if (s.size() == 0 || s.peek() < arr[i]) {
				s.add(arr[i++]);
			} else {
				s.pop();
			}
		}
		return s.stream().mapToInt(i -> i).toArray();
	}
}