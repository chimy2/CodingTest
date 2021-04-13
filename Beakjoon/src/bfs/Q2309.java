package bfs;

import java.io.*;
import java.util.Arrays;

public class Q2309 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] arr=new int[9];
		int sum=0;
		int[] no={0, 1};
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		while(no[0]!=8) {
			int result=sum-arr[no[0]]-arr[no[1]];
			if(result==100) break;
			if(no[1]<8) {
				no[1]++;
			} else {
				no[0]++;
				no[1]=no[0]+1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i!=no[0] && i!=no[1]) System.out.println(arr[i]);
		}
	}
}
