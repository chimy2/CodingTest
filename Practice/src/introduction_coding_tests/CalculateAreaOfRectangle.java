package introduction_coding_tests;

public class CalculateAreaOfRectangle {
//	직사각형 넓이 구하기
	public int solution(int[][] dots) {
		int a = 0;
		for (int i = 1; i < dots.length; i++) {
			if (dots[0][0] != dots[i][0] && dots[0][1] != dots[i][1]) {
				a = i;
				break;
			}
		}
		return Math.abs((dots[0][0] - dots[a][0]) * (dots[0][1] - dots[a][1]));
	}
}