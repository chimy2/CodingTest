package coding_basic_training;

import java.util.Stack;

public class SumOfTwoNumbers {
//	두 수의 합
	public String solution(String a, String b) {
		String answer = "";
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		for (int i = 0, j = 0; i < a.length() || j < b.length(); i++, j++) {
			int x = a.length() > i ? a.charAt(a.length() - i - 1) - 48 : 0;
			int y = b.length() > j ? b.charAt(b.length() - j - 1) - 48 : 0;
			int z = s.pop() + x + y;
			s.push(z % 10);
			s.push(z / 10);
		}
		if (s.peek() == 0)
			s.pop();
		while (s.size() != 0) {
			answer += s.pop();
		}
		return answer;
	}
}