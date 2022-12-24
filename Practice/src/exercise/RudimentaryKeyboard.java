package exercise;

import java.util.HashMap;
import java.util.Map;

public class RudimentaryKeyboard {
//	대충 만든 자판
	public int[] solution(String[] keymap, String[] targets) {
		int[] answer = new int[targets.length];
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (int i = 0; i < 26; i++) {
			char s = (char) (i + 65);
			int min = 101;
			for (String k : keymap) {
				int idx = k.indexOf(s);
				if (idx > -1) {
					min = Math.min(min, idx);
				}
			}
			m.put(s, min > 100 ? -1 : min);
		}

		for (int i = 0; i < targets.length; i++) {
			int count = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				int n = m.get(targets[i].charAt(j));
				if (n < 0) {
					count = -1;
					break;
				}
				count += n + 1;
			}
			answer[i] = count;
		}

		return answer;
	}
}