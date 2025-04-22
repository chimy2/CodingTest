package exercise;

//	혼자서 하는 틱택토
public class TicTacToeSoloPlay {
	public int solution(String[] board) {
		int o = 0;
		int x = 0;

		for (String s : board) {
			o += 3 - s.replace("O", "").length();
			x += 3 - s.replace("X", "").length();
		}

		if (o < x || Math.abs(o - x) > 1 || isWin(board, 'O') && o == x || isWin(board, 'X') && o > x) {
			return 0;
		}

		return 1;
	}

	public boolean isWin(String[] board, char target) {
		boolean isHorizon = false;
		boolean isVertical = false;
		boolean isDiagonal = false;
		boolean isOppDiagonal = false;
		int countDiagonal = 0;
		int countOppDiagonal = 0;
		String s = String.valueOf(target).repeat(3);

		for (int i = 0; i < 3; i++) {
			if (board[i].equals(s)) {
				isHorizon = true;
			}

			int countVertical = 0;
			for (int j = 0; j < 3; j++) {
				if (board[j].charAt(i) == target)
					countVertical++;
			}

			if (countVertical == 3)
				isVertical = true;

			if (board[i].charAt(i) == target) {
				countDiagonal++;
			}
			if (board[i].charAt(2 - i) == target) {
				countOppDiagonal++;
			}
		}

		if (countDiagonal == 3) {
			isDiagonal = true;
		}
		if (countOppDiagonal == 3) {
			isOppDiagonal = true;
		}
		return isHorizon || isVertical || isDiagonal || isOppDiagonal;
	}
}