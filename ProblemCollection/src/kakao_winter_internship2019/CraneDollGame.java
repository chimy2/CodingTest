package kakao_winter_internship2019;

import java.util.LinkedList;
import java.util.List;

public class CraneDollGame {
//	크레인 인형뽑기 게임
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> li = new LinkedList<Integer>();
		for (int y : moves) {
			for (int x = 0; x < board.length; x++) {
				int num = board[x][y - 1];
				if (num != 0) {
					int len = li.size();
					if (len >= 1 && li.get(len - 1) == num) {
						li.remove(len - 1);
						answer += 2;
					} else {
						li.add(num);
					}
					board[x][y - 1] = 0;
					break;
				}
			}
		}
		return answer;
//		Stack<Integer> st = new Stack<Integer>();
//		int answer = 0;
//		for (int i = 0; i < moves.length; i++) {
//			for (int j = 0; j < board[moves[i] - 1].length; j++) {
//				if (board[j][moves[i] - 1] > 0) {
//					if (st.size() == 0) {
//						st.add(board[j][moves[i] - 1]);
//						board[j][moves[i] - 1] = 0;
//					} else if (st.peek() == board[j][moves[i] - 1]) {
//						st.pop();
//						board[j][moves[i] - 1] = 0;
//						answer++;
//					} else {
//						st.add(board[j][moves[i] - 1]);
//						board[j][moves[i] - 1] = 0;
//					}
//					break;
//				}
//			}
//		}
//		return answer * 2;
	}
}