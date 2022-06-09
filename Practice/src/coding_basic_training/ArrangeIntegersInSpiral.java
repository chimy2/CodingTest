package coding_basic_training;

public class ArrangeIntegersInSpiral {
//	정수를 나선형으로 배치하기
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int count = 0;
		for (int i = 1, x = 0, y = 0; i <= n * n; i++) {
			switch (count % 4) {
			case 0:
				answer[x][y++] = i;
				if (y == n - count / 4) {
					x++;
					y--;
					count++;
				}
				break;
			case 1:
				answer[x++][y] = i;
				if (x == n - count / 4) {
					x--;
					y--;
					count++;
				}
				break;
			case 2:
				answer[x][y--] = i;
				if (y == 0 + count / 4 - 1) {
					x--;
					y++;
					count++;
				}
				break;
			case 3:
				answer[x--][y] = i;
				if (x == 0 + count / 4) {
					x++;
					y++;
					count++;
				}

			}
		}
		return answer;
	}
}