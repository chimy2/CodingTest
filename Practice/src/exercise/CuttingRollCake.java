package exercise;

import java.util.HashMap;
import java.util.Map;

// 롤케이크 자르기
public class CuttingRollCake {
	public int solution(int[] topping) {
		int answer = 0;

		int n = topping.length;
		Map<Integer, Integer> iron = new HashMap<Integer, Integer>();
		Map<Integer, Integer> bro = new HashMap<Integer, Integer>();

		for (int type : topping) {
			setValue(iron, type, 1);
		}

		for (int i = n - 1; i >= 0; i--) {
			int type = topping[i];

			setValue(bro, type, 1);

			setValue(iron, type, -1);
			if (iron.get(type) == 0) {
				iron.remove(type);
			}

			if (iron.size() == bro.size()) {
				answer++;
			}
		}

		return answer;
	}

	public void setValue(Map<Integer, Integer> map, int num, int value) {
		map.put(num, map.getOrDefault(num, 0) + value);
	}
}