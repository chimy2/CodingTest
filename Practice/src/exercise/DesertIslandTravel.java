package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//	무인도 여행
public class DesertIslandTravel {

	public int[] solution(String[] maps) {
		List<Integer> answer = new ArrayList<Integer>();
		int y = maps.length;
		int x = maps[0].length();

		int[][] arr = new int[y + 2][x + 2];
		boolean[][] checked = new boolean[y + 2][x + 2];
		int[][] direct = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				char c = maps[i].charAt(j);
				arr[i + 1][j + 1] = c == 'X' ? 0 : Character.getNumericValue(c);
			}
		}

		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= x; j++) {
				if (arr[i][j] != 0 && !checked[i][j]) {
					answer.add(searchArea(arr, checked, direct, i, j, y, x));

				}
			}
		}

		Collections.sort(answer);

		if (answer.size() == 0) {
			answer.add(-1);
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}

	private int searchArea(int[][] arr, boolean[][] checked, int[][] direct, int y, int x, int maxY, int maxX) {

		int count = arr[y][x];
		checked[y][x] = true;

		for (int i = 0; i < direct.length; i++) {
			int y2 = y + direct[i][0];
			int x2 = x + direct[i][1];

			if (x2 > 0 && x2 <= maxX && y2 > 0 && y2 <= maxY && !checked[y2][x2] && arr[y2][x2] != 0) {
				count += searchArea(arr, checked, direct, y2, x2, maxY, maxX);
			}
		}
		return count;
	}
}