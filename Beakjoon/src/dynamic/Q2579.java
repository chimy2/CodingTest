package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2579 {
//	계단 오르기
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[Integer.parseInt(br.readLine())];
		int[] dp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dp[0]=arr[0];
		if(arr.length>=2) dp[1]=arr[0]+arr[1];
		if(arr.length>=3) dp[2]=Math.max(arr[0]+arr[2], arr[1]+arr[2]);
		for(int i=3;i<arr.length;i++) {
			dp[i]=Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
		}
		System.out.println(dp[dp.length-1]);
	}
}
