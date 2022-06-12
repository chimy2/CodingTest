package coding_basic_training;

public class TraverseDiagonalOf2DArray {
//	이차원 배열 대각선 순회하기
	public int solution(int[][] board, int k) {
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length && i + j <= k; j++) {
				answer += board[i][j];
			}
		}
		return answer;
	}
}