package introduction_coding_tests;

import java.util.HashMap;
import java.util.Map;

public class CharacterCoordinates {
//	캐릭터의 좌표
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = { 0, 0 };
		Map<String, int[]> m = new HashMap<String, int[]>();
		m.put("left", new int[] { -1, 0 });
		m.put("right", new int[] { 1, 0 });
		m.put("up", new int[] { 0, 1 });
		m.put("down", new int[] { 0, -1 });
		for (int i = 0; i < keyinput.length; i++) {
			int[] d = m.get(keyinput[i]);
			int x = answer[0] + d[0];
			int y = answer[1] + d[1];
			if (Math.abs(x) <= board[0] / 2 && Math.abs(y) <= board[1] / 2) {
				answer[0] = x;
				answer[1] = y;
			}
		}
		return answer;
	}
}