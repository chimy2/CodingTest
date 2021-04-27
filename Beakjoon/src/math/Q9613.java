package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9613 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		while(count--!=0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int[] arr=new int[Integer.parseInt(st.nextToken())];
			long sum=0;
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					int gcd=1;
					int x=arr[i];
					int y=arr[j];
					for(int k=2;k<=x&&k<=y;) {
						if(x%k==0 && y%k==0) {
							gcd*=k;
							x/=k;
							y/=k;
						} else {
							k++;
						}
					}sum+=gcd;
				}
			}
			System.out.println(sum);
		}
	}
}
