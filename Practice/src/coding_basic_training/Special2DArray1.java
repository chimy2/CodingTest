package coding_basic_training;

public class Special2DArray1 {
//	특별한 이차원 배열1
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < n; i++) {
			answer[i][i] = 1;
		}
		return answer;
	}
}