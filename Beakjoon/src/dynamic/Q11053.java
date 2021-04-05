package dynamic;

import java.io.*;
import java.util.Arrays;

public class Q11053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] dp=new int[arr.length];
		Arrays.fill(dp, 1);
		int answer=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) dp[i]=Math.max(dp[i], dp[j]+1);
			}
			if(answer<dp[i]) answer=dp[i];
		}
		System.out.println(answer);
	}
}
