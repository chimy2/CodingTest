package exercise;

import java.util.Stack;

// 뒤에 있는 큰 수 찾기
public class FindNextGreaterNumber {
	public int[] solution(int[] numbers) {
		int len = numbers.length;
		int[] answer = new int[len];
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> temp;
		int last = numbers[len - 1];

		answer[len - 1] = -1;
		s.add(last);

		for (int i = len - 2; i >= 0; i--) {
			int num = numbers[i];
			temp = new Stack<Integer>();
			int result = -1;

			while (!s.empty()) {
				int a = s.pop();

				if (a > num) {
					temp.add(a);
					result = a;
					break;
				}
			}
			answer[i] = result;

			while (!temp.empty()) {
				s.add(temp.pop());
			}

			if (s.empty() || s.peek() > num) {
				s.add(num);
			}
		}
		return answer;
	}
}