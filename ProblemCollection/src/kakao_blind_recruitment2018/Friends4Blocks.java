package kakao_blind_recruitment2018;

import java.util.Arrays;

public class Friends4Blocks {
    public int solution(int m, int n, String[] board) {
        int answer=0;
        int count=0;
        String[] board2=Arrays.copyOf(board, board.length);

        do{
            count=0;
            for(int i=0;i<m-1;i++) {
                for(int j=0;j<n-1;j++) {
                    count+=checkBlock(board, board2, i, j);
                }
            }
            answer+=count;
            for(int i=m-1;i>=0;i--) {
                for(int j=n-1;j>=0;j--) {
                    if(board2[i].charAt(j)==' ') changeArr(board2, i,j);
                }
            }
            board=Arrays.copyOf(board2, board2.length);
        } while(count>0);
        return answer;
    }

    public int checkBlock(String[] board, String[] board2, int i, int j) {
        if(board[i].charAt(j)==board[i+1].charAt(j)
            && board[i+1].charAt(j)==board[i+1].charAt(j+1)
            && board[i].charAt(j)==board[i].charAt(j+1)) {
            int n=0;
            for(int x=0;x<2;x++) {
                for(int y=0;y<2;y++) {
                    if(board2[i+x].charAt(j+y)!=' ') n++;
                }
            }
            board2[i]=board2[i].substring(0, j)+"  "+board2[i].substring(j+2);
            board2[i+1]=board2[i+1].substring(0, j)+"  "+board2[i+1].substring(j+2);
            return n;
        }
        return 0;
    }

    public void changeArr(String[] board2, int i, int j) {
        for(int x=i-1;x>=0;x--) {
            char c=board2[x].charAt(j);
            if(c!=' ') {
                board2[x]=board2[x].substring(0, j)+' '+board2[x].substring(j+1);
                board2[i]=board2[i].substring(0, j)+c+board2[i].substring(j+1);
                break;
            }
        }
    }
}
