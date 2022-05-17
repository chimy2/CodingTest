package coding_basic_training;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ConcatenateStrings {
//	문자열 묶기
	public int solution(String[] strArr) {
		int answer = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (String s : strArr) {
			if (!m.containsKey(s.length())) {
				m.put(s.length(), 1);
			} else {
				m.put(s.length(), m.get(s.length()) + 1);
			}
		}
		for (Entry<Integer, Integer> e : m.entrySet()) {
			if (answer == 0) {
				answer = e.getValue();
			} else {
				answer = Math.max(answer, e.getValue());
			}
		}
		return answer;
//		return Arrays.stream(strArr).collect(Collectors.groupingBy(String::length)).values().stream()
//				.max(Comparator.comparingInt(List::size)).orElse(Collections.emptyList()).size();
	}
}