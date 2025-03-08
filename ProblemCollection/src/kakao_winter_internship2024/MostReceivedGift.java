package kakao_winter_internship2024;

import java.util.HashMap;
import java.util.Map;

// 가장 많이 받은 선물
public class MostReceivedGift {

	public int solution(String[] friends, String[] gifts) {
		int answer = 0;

		int n = friends.length;
		Map<String, Integer> map = new HashMap<String, Integer>();
		int[][] details = new int[n][n];
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			map.put(friends[i], i);
		}

		for (int i = 0; i < gifts.length; i++) {
			String[] temp = gifts[i].split(" ");

			int giver = map.get(temp[0]);
			int recipient = map.get(temp[1]);

			details[giver][recipient]++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (i == j)
					continue;

				if (details[i][j] > details[j][i]) {
					result[i]++;
				} else if (details[i][j] < details[j][i]) {
					result[j]++;
				} else {
					int countI = 0;
					int countJ = 0;

					for (int k = 0; k < n; k++) {
						countI += details[i][k] - details[k][i];
						countJ += details[j][k] - details[k][j];
					}

					if (countI > countJ) {
						result[i]++;
					} else if (countI < countJ) {
						result[j]++;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			answer = Math.max(answer, result[i]);
		}

		return answer;
	}
}