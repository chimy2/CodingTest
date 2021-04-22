package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14501 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[][] arr=new int[num+1][2];
		int[] dp=new int[num+1];
		for(int i=0;i<num;i++) {
			String[] s=br.readLine().split(" ");
			arr[i][0]=Integer.parseInt(s[0]);
			arr[i][1]=Integer.parseInt(s[1]);
		}
		for(int i=num-1;i>=0;i--) {
			if(arr[i][0]+i>=num+1) dp[i]=dp[i+1];
			else if(arr[i][0]+i<=num) {
				dp[i]=Math.max(arr[i][1]+dp[i+arr[i][0]], dp[i+1]);
			}
		}
		System.out.println(dp[0]);
	}
}

