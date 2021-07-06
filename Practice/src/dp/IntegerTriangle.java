package dp;

public class IntegerTriangle {
    public int solution(int[][] triangle) {
        int answer=0;
		int[][] dp=new int[triangle.length][triangle.length];
		dp[0][0]=triangle[0][0];
		for(int i=1;i<triangle.length;i++) {
			for(int j=0;j<triangle[i].length;j++) {
				if(j==0) {
					dp[i][j]=dp[i-1][j]+triangle[i][j];
				} else if(j==triangle[i].length-1) {
					dp[i][j]=dp[i-1][j-1]+triangle[i][j];
				} else {
					dp[i][j]=triangle[i][j]+Math.max(dp[i-1][j-1], dp[i-1][j]);
				}
			}
		}
		for(int i=dp.length-1, j=0;j<dp[i].length;j++) {
			if(dp[i][j]>answer) answer=dp[i][j];
		}
        return answer;
    }
}
