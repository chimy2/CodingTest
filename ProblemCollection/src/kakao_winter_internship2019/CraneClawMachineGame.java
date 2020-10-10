package kakao_winter_internship2019;

import java.util.Stack;

public class CraneClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> st=new Stack<Integer>();
		int answer=0;
		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board[moves[i]-1].length;j++) {
				if(board[j][moves[i]-1]>0) {
					if(st.size()==0) {
						st.add(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
					}else if(st.peek()==board[j][moves[i]-1]) {
						st.pop();
						board[j][moves[i]-1]=0;
						answer++;
					}else {
						st.add(board[j][moves[i]-1]);
						board[j][moves[i]-1]=0;
					}
					break;
				}
			}
		}
        return answer*2;
    }
}
