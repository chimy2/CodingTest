package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q6588 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		int n=0;
		boolean[] arr=new boolean[1000001];
		Arrays.fill(arr, true);
		for(int i=3;i<=1000;i+=2) {
			for(int j=2;arr[i]&&j*i<arr.length;j++) {
				arr[j*i]=false;
			}
		}
		while((n=Integer.parseInt(br.readLine()))!=0) {
			for(int i=3;i<=n;i+=2) {
				if(i==arr.length) sb.append("Goldbach's conjecture is wrong.\n"); 
				else if(arr[i] && arr[n-i]) {
					sb.append(n+" = "+i+" + "+(n-i)+"\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
