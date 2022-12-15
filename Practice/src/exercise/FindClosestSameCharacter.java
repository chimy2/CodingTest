package exercise;

import java.util.stream.IntStream;

public class FindClosestSameCharacter {
//	가장 가까운 같은 글자
	public int[] solution(String s) {
		return IntStream.range(0, s.length())
				.map(i -> s.lastIndexOf(s.charAt(i), i - 1) >= 0 ? i - s.lastIndexOf(s.charAt(i), i - 1) : -1)
				.toArray();
//		int[] answer = new int[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			int index = s.lastIndexOf(s.charAt(i), i - 1);
//			answer[i] = index >= 0 ? i - index : -1;
//		}
//		return answer;
	}
}