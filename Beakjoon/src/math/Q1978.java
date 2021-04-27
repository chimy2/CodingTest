package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr=new boolean[1000];
		Arrays.fill(arr, true);
		for(int i=0;i<arr.length;i++) {
			if(i==0) arr[i]=false;
			for(int j=2,x=i+1;j<x;j++) {
				if(x%j==0) {
					arr[i]=false;
					break;
				}
			}
		}
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int sum=0;
		for(int i=0;i<num;i++) {
			if(arr[Integer.parseInt(st.nextToken())-1]) sum++;
		}
		System.out.println(sum);
	}
}
