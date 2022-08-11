package introduction_coding_tests;

public class Parallel {
//	평행
	public int solution(int[][] dots) {
		int x1 = dots[0][0], x2 = 0, x3 = 0, x4 = 0;
		int y1 = dots[0][1], y2 = 0, y3 = 0, y4 = 0;
		for (int i = 1; i < 4; i++) {
			x2 = dots[i][0];
			y2 = dots[i][1];
			x3 = -1;
			for (int j = 1; j < 4; j++) {
				if (x2 != dots[j][0] || y2 != dots[j][1]) {
					if (x3 == -1) {
						x3 = dots[j][0];
						y3 = dots[j][1];
					} else {
						x4 = dots[j][0];
						y4 = dots[j][1];
						break;
					}
				}
			}
			if ((y2 - y1) * (x4 - x3) == (y4 - y3) * (x2 - x1))
				return 1;
		}
		return 0;
	}
}