package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1929 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			int m=Integer.parseInt(s[0]);
			int n=Integer.parseInt(s[1]);
			boolean[] arr=new boolean[n+1];
			StringBuffer sb=new StringBuffer();
			arr[1]=true;
			for(int i=2;i<=n;i++) {
				if(!arr[i]) {
					for(int j=2;i*j<=n;j++) {
						arr[i*j]=true;
					}
				}
			}
			for(int i=m;i<=n;i++) {
				if(!arr[i]) sb.append(i+"\n");
			}
			System.out.println(sb);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
