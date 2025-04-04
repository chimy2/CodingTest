package exercise;

import java.util.LinkedList;
import java.util.Queue;

//	미로 탈출
public class MazeEscape {
    
	public int solution(String[] maps) {
		int x = maps.length;
		int y = maps[0].length();

		char[][] arr = new char[x][y];
		int[][] move = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

		for (int i = 0; i < x; i++) {
			arr[i] = maps[i].toCharArray();
		}

		int[] start = new int[3];

		loop: for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 'S') {
					start[0] = i;
					start[1] = j;
					break loop;
				}
			}
		}

		return find(arr, move, start, 'L');
	}

	private int find(char[][] arr, int[][] move, int[] start, char search) {
		int x = arr.length;
		int y = arr[0].length;
		boolean[][] check = new boolean[x][y];
		Queue<int[]> q = new LinkedList<int[]>();
		boolean isFind = false;
		int[] last = new int[3];

		q.add(start);
        check[start[0]][start[1]] = true;
        

		loop : while (!q.isEmpty()) {
			last = q.poll();

			for (int i = 0; i < move.length; i++) {
				int tempX = last[0] + move[i][0];
				int tempY = last[1] + move[i][1];

				if (tempX < 0 || tempX >= x || tempY < 0 || tempY >= y || check[tempX][tempY]) {
					continue;
				}

				char c = arr[tempX][tempY];

				if (c == search) {
					isFind = true;
					last = new int[] { tempX, tempY, last[2] + 1 };
					break loop;
				} else if (c != 'X') {
        			check[tempX][tempY] = true;
					q.add(new int[] { tempX, tempY, last[2] + 1 });
				}
			}

		}

		if (!isFind) {
			return -1;
		} else {
			if (search == 'L') {
				return find(arr, move, last, 'E');
			} else {
				return last[2];
			}
		}
	}
}