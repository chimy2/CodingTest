package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// 할인 행사
public class DiscountEvent {

	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;

		Map<String, Integer> wish = new HashMap<String, Integer>();
		Map<String, Integer> sale = new HashMap<String, Integer>();

		for (int i = 0; i < want.length; i++) {
			wish.put(want[i], number[i]);
		}

		for (int i = 0; i < discount.length; i++) {
			sale.put(discount[i], sale.getOrDefault(discount[i], 0) + 1);

			if (i >= 10) {
				sale.put(discount[i - 10], sale.get(discount[i - 10]) - 1);
			}

			if (isCheck(wish, sale)) {
				answer++;
			}
		}

		return answer;
	}

	public boolean isCheck(Map<String, Integer> wish, Map<String, Integer> sale) {

		for (Entry<String, Integer> entry : wish.entrySet()) {
			if (entry.getValue() > sale.getOrDefault(entry.getKey(), 0)) {
				return false;
			}
		}

		return true;
	}
}