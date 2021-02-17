package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2748 {
//	피보나치 수2
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long[] arr=new long[Integer.parseInt(br.readLine())+1];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		System.out.println(arr[arr.length-1]);
	}
}
