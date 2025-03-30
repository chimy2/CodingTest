package kakao_recuritment_linked_internship2021;

// 거리두기 확인하기
public class CheckingSocialDistancing {

	public int[] solution(String[][] places) {
		int n = places.length;
		int[] answer = new int[n];
		int[][] moves = { { -2, 0 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -2 }, { 0, -1 }, { 0, 1 }, { 0, 2 },
				{ 1, -1 }, { 1, 0 }, { 1, 1 }, { 2, 0 } };

		for (int i = 0; i < n; i++) {
			if (isAllPass(places[i], moves)) {
				answer[i] = 1;
			}
		}

		return answer;
	}

	public boolean isAllPass(String[] place, int[][] moves) {
		boolean result = true;

		loop: for (int i = 0; i < place.length; i++) {
			for (int j = 0; j < place[i].length(); j++) {
				if (place[i].charAt(j) == 'P' && !isPass(place, moves, i, j)) {
					result = false;
					break loop;
				}
			}
		}

		return result;
	}

	public boolean isPass(String[] place, int[][] moves, int x, int y) {
		boolean result = true;

		for (int[] move : moves) {
			int x2 = x + move[0];
			int y2 = y + move[1];

			if (x2 < 0 || x2 >= place.length || y2 < 0 || y2 >= place[x2].length())
				continue;

			if (place[x2].charAt(y2) == 'P') {
				int diffX = Math.abs(x2 - x);
				int diffY = Math.abs(y2 - y);

				if (diffX + diffY == 1) {
					result = false;
					break;
				} else {
					if (diffX == 1 && !hasMultiPartition(place, x, y, x2, y2)
							|| diffX != 1 && !hasPartition(place, x, y, x2, y2)) {
						result = false;
						break;
					}
				}
			}
		}

		return result;
	}

	public boolean hasMultiPartition(String[] place, int x, int y, int x2, int y2) {
		if (place[x].charAt(y2) == 'X' && place[x2].charAt(y) == 'X') {
			return true;
		}
		return false;
	}

	public boolean hasPartition(String[] place, int x, int y, int x2, int y2) {
		if (place[(x + x2) / 2].charAt((y + y2) / 2) == 'X') {
			return true;
		}
		return false;
	}
}