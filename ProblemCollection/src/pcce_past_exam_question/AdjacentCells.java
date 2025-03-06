package pcce_past_exam_question;

// [PCCE 기출문제] 9번 / 이웃한 칸
public class AdjacentCells {

	public int solution(String[][] board, int h, int w) {
		int n = board.length;
		int count = 0;

		int[] dh = { 0, 1, -1, 0 };
		int[] dw = { 1, 0, 0, -1 };

		for (int i = 0; i < 4; i++) {
			int h_check = h + dh[i];
			int w_check = w + dw[i];

			if (isInBoard(h_check, n) && isInBoard(w_check, n) && board[h][w].equals(board[h_check][w_check])) {
				count++;
			}
		}

		return count;
	}

	public boolean isInBoard(int target, int n) {
		return target >= 0 && target < n;
	}
}
