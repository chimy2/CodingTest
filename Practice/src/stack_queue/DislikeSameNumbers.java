package stack_queue;

import java.util.Stack;

public class DislikeSameNumbers {
//	같은 숫자는 싫어
	public int[] solution(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i : arr) {
			if (s.empty() || s.peek() != i) {
				s.add(i);
			}
		}
		return s.stream().mapToInt(i -> i).toArray();
	}
//	public List solution(int[] arr) {
//		List<Integer> ls = new ArrayList();
//		int num = 0;
//		ls.add(arr[0]);
//		for (int i = 1; i < arr.length; i++) {
//			if (ls.get(num) != arr[i]) {
//				ls.add(arr[i]);
//				num++;
//			}
//		}
//		return ls;
//	}
}