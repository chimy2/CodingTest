package dynamic;

import java.io.*;
import java.util.Arrays;

public class Q1912 {
	public static void main(String[] arg) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] dp=new int[num];
		int sum=arr[0];
		dp[0]=arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]<0) {
				if(sum+arr[i]>0) {
					sum+=arr[i];
				} else {
					sum=arr[i];
				}
			} else {
				if(sum<0) sum=arr[i];
				else sum+=arr[i];
			}
			dp[i]=Math.max(sum, dp[i-1]);
		}
		System.out.println(dp[num-1]);
	}
}
