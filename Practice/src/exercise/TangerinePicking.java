package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

// 귤 고르기
public class TangerinePicking {
	public int solution(int k, int[] tangerine) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < tangerine.length; i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
		}

		PriorityQueue<Entry<Integer, Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

		pq.addAll(map.entrySet());

		while (k > 0) {
			k -= pq.poll().getValue();
			answer++;
		}

		return answer;
	}
}