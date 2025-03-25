package exercise;

import java.util.Stack;

//	택배상자
public class ParcelBox {

	public int solution(int[] order) {
		int answer = 0;

		int n = order.length;
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 1; i <= order.length;) {
			if (order[answer] == i) {
				answer++;
				i++;
			} else {
				while (s.size() > 0 && s.peek() == order[answer]) {
					s.pop();
					answer++;
				}
				s.add(i++);
			}
		}

		if (answer != n) {
			while (s.size() > 0 && s.peek() == order[answer]) {
				s.pop();
				answer++;
			}
		}

		return answer;
	}
}