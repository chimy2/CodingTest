package dynamic;

import java.io.*;

public class Q11052 {
	public static void main(String [] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String[] s=br.readLine().split(" ");
		int[] arr=new int[s.length+1];
		for(int i=0;i<s.length;i++) {
			arr[i+1]=Integer.parseInt(s[i]);
		}
		int[] dp=new int[num+1];
		for(int i=1;i<=num;i++) {
			int max=arr[i];
			for(int j=i-1;j>0;j--) {
				int p=i%j==0?dp[j]*(i/j):dp[j]*(i/j)+dp[i%j];
				if(p>max) max=p;
			}
			dp[i]=Math.max(max, dp[i-1]);
		}
		System.out.println(dp[num]);
	}
}
