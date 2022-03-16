package coding_basic_training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DiceGame3 {
//	주사위 게임3
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		Integer temp = 0;
		int count = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		m.put(a, 1);
		temp = m.put(b, m.getOrDefault(b, 0) + 1);
		count = Math.max(temp != null ? temp : 0, count);
		temp = m.put(c, m.getOrDefault(c, 0) + 1);
		count = Math.max(temp != null ? temp : 0, count);
		temp = m.put(d, m.getOrDefault(d, 0) + 1);
		count = Math.max(temp != null ? temp : 0, count);

		Iterator<Entry<Integer, Integer>> i = m.entrySet().iterator();
		List<Map.Entry<Integer, Integer>> li = new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
		li = li.stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());
		int one = li.get(0).getKey();
		int two = li.size() > 1 ? li.get(1).getKey() : 0;
		switch (count) {
		case 0:
			answer = m.keySet().stream().mapToInt(x -> x).min().orElse(0);
			break;
		case 1:
			if (m.size() > 2) {
				answer = one * two;
			} else {
				answer = (one + two) * Math.abs(one - two);
			}
			break;
		case 2:
			answer += Math.pow(li.get(0).getKey() + li.get(1).getKey() * 10, 2);
			break;
		case 3:
			answer = i.next().getKey() * 1111;
		}
		return answer;
	}
}
