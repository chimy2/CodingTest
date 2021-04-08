package dynamic;

import java.io.*;

public class Q9461 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		long[] dp=new long[100];
		int last=0;
		for(int i=0;i<num;i++) {
			int su=Integer.parseInt(br.readLine());
			if(dp[su-1]==0) {
				for(int j=last;j<su;j++) {
					if(j<3) {
						dp[j]=1;
						last++;
					} else if(j<5) {
						dp[j]=2;
						last++;
					} else {
						dp[j]=dp[j-1]+dp[j-5];
						last++;
					}
				}
			}
			System.out.println(dp[su-1]);
		}
	}
}
