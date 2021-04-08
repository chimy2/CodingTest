package dynamic;

import java.io.*;

public class Q11727 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][] dp=new int[n][2];
		dp[0][0]=1;
		dp[0][1]=0;
		for(int i=1;i<n;i++) {
			dp[i][0]=(dp[i-1][0]+dp[i-1][1])%10007;
			dp[i][1]=dp[i-1][0]*2%10007;
		}
		System.out.println((dp[n-1][0]+dp[n-1][1])%10007);
	}
}
