package dynamic;

import java.io.*;

public class Q10844 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] dp=new int[n][10];
		int answer=0;
		dp[0]=new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		for(int i=1;i<n;i++) {
			dp[i][0]=dp[i-1][1];
			dp[i][9]=dp[i-1][8];
			for(int j=1;j<9;j++) {
				dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
			}
		}
		for(int i: dp[n-1]) {
			answer=(answer+i)%1000000000;
		}
		System.out.println(answer);
	}

}
