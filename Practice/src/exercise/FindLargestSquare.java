package exercise;

public class FindLargestSquare {
// 가장 큰 정사각형 찾기
//	100.0 / 100.0
	public int solution2(int [][]board)
    {
		int max=0;
		if(board.length==1 || board[0].length==1) {
			for(int i=0;i<board.length;i++) {
				if(max==1) break;
				for(int j=0;j<board[i].length;j++) {
					if(board[i][j]==1) {
						max=1;
						break;
					}
				}
			}
		}
		for(int i=1;i<board.length;i++) {
			for(int j=1;j<board[i].length;j++) {
				if(board[i][j]>0) {
					int leftTop=board[i-1][j-1];
					int rightTop=board[i-1][j];
					int leftBottom=board[i][j-1];
					
					board[i][j]=Math.min(Math.min(rightTop, leftBottom), leftTop)+1;
					max=Math.max(max, board[i][j]);
				}
			}
		}
        return (int)Math.pow(max, 2);
    }
	
//	50.2 / 100.0
	public int solution(int [][]board) {
        int answer=0;
		int x=0, y=0;
		int first=-1, last=-1; 
		for(int[] b:board) {
			if(answer==1) break;
			for(int i=0;i<b.length;i++) {
				if(b[i]==1) {
					answer=1;
					break;
				}
			}
		}
		while(x<board.length-1 || y<board[x].length-1){
			if(y==board[x].length) {
				x++;
				y=0;
			}
			if(first==-1 && board[x][y]==1){
				first=y;
			}else if(first!=-1 && board[x][y]==1 && y!=board[x].length-1) {
				
				last=y;
			}else if(last!=-1 && board[x][y]==0 
					|| first!=-1 && y==board[x].length-1) {
				if(y==board[x].length-1) last=y;
				for(int i=first;i<=last;i++) {
					int num=last-i+1;
					int pow=(int) Math.pow(num, 2);
					if(pow<=answer) break;
					if(x+(pow-num)/num>=board.length) continue;
					for(int j=first;j<=last-num+1;j++) {
						for(int k=0;k<pow-num;k++) {
							if(board[x+k/num+1][j+k%num]!=1) break;
							if(k==pow-num-1) {
								answer=pow;
							}
						}
					}
				}
				first=-1;
				last=-1;
			}
			y++;
		}
        return answer;
    }
}
