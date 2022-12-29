package exercise;

import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
//	추억 점수
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < name.length; i++) {
			m.put(name[i], yearning[i]);
		}
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				answer[i] += m.getOrDefault(photo[i][j], 0);
			}
		}
		return answer;
	}
}