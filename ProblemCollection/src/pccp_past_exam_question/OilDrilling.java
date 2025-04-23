package pccp_past_exam_question;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//	[PCCP 기출문제] 2번 / 석유 시추
public class OilDrilling {
	public int solution(int[][] land) {
		int answer = 0;
		int x = land.length;
		int y = land[x - 1].length;
		int[][] areas = new int[x][y];
		int[] size = new int[y];
		int[][] move = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (land[i][j] == 1) {
					findArea(land, areas, size, move, i, j);
				}
			}
		}

		for (int i = 0; i < y; i++) {
			int sum = 0;
			for (int j = 0; j < size[i]; j++) {
				sum += areas[j][i];
			}
			answer = Math.max(answer, sum);
		}

		return answer;
	}

	public void findArea(int[][] land, int[][] areas, int[] size, int[][] move, int x, int y) {
		int area = 0;
		Set<Integer> set = new HashSet<Integer>();
		Queue<int[]> q = new LinkedList<int[]>();

		land[x][y] = 0;
		set.add(y);
		q.add(new int[] { x, y });

		while (!q.isEmpty()) {
			int[] d = q.poll();
			area++;

			for (int i = 0; i < move.length; i++) {
				int x2 = d[0] + move[i][0];
				int y2 = d[1] + move[i][1];

				if (x2 < 0 || y2 < 0 || x2 >= land.length || y2 >= land[x2].length || land[x2][y2] == 0)
					continue;

				land[x2][y2] = 0;
				set.add(y2);
				q.add(new int[] { x2, y2 });
			}
		}

		for (int i : set) {
			areas[size[i]][i] = area;
			size[i]++;
		}
	}
}