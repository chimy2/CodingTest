package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1010 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[][] dp=new int[30][30];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				if(i==0 || j==0 || i==j) {
					dp[i][j]=1;
				} else {
					dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
				}
			}
		}
		int num=Integer.parseInt(br.readLine());
		while(num--!=0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			System.out.println(dp[m][n]);
		}
	}
}
