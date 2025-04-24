package programmers_codechallenge2025_round1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//	지게차와 크레인
public class ForkliftCrane {
	private char[][] st;
	private int remain;
	private int n;
	private int m;
	private int[] dx = { 0, 0, 1, -1 };
	private int[] dy = { 1, -1, 0, 0 };
	private char out = '\0';
	private char unknown = '?';

	public int solution(String[] storage, String[] requests) {
		n = storage.length;
		m = storage[n - 1].length();

		st = new char[n + 2][m + 2];
		remain = n * m;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				st[i + 1][j + 1] = storage[i].charAt(j);
			}
		}

		for (String s : requests) {
			char c = s.charAt(0);
			int temp = remain;

			if (s.length() == 1) {
				useForklift(c);
			} else {
				useCrane(c);
			}

			if (temp != remain) {

				updateElement();
			}
		}

		return remain;
	}

	public void useCrane(char c) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (st[i][j] == c) {
					st[i][j] = unknown;
					remain--;
				}
			}
		}
	}

	public void useForklift(char c) {
		List<int[]> li = new ArrayList<int[]>();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (st[i][j] == c && isExist(i, j, out)) {
					li.add(new int[] { i, j });
					remain--;
				}
			}
		}

		for (int[] arr : li) {
			st[arr[0]][arr[1]] = out;
		}
	}

	public boolean isExist(int x, int y, char c) {
		for (int i = 0; i < 4; i++) {
			if (st[x + dx[i]][y + dy[i]] == c)
				return true;
		}
		return false;
	}

	public void updateElement() {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (st[i][j] == unknown) {
					updateElement(i, j);
				}
			}
		}
	}

	public void updateElement(int x, int y) {
		List<int[]> path = new ArrayList<int[]>();
		boolean[][] check = new boolean[n][m];
		Queue<int[]> q = new LinkedList<int[]>();
		boolean hasExit = false;

		path.add(new int[] { x, y });
		q.add(path.get(0));
		check[x - 1][y - 1] = true;

		while (!q.isEmpty() && !hasExit) {
			int[] arr = q.poll();

			for (int i = 0; i < 4; i++) {
				int x2 = arr[0] + dx[i];
				int y2 = arr[1] + dy[i];
				if (st[x2][y2] == unknown && !check[x2 - 1][y2 - 1]) {
					path.add(new int[] { x2, y2 });
					q.add(path.get(path.size() - 1));
					check[x2 - 1][y2 - 1] = true;
				}
				if (st[x2][y2] == out) {
					hasExit = true;
				}
			}
		}

		if (hasExit) {
			for (int[] arr : path) {
				st[arr[0]][arr[1]] = out;
			}
		}
	}
}