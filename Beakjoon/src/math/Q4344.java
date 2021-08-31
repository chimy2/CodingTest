package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q4344 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String[] arr=br.readLine().split(" ");
				int count=Integer.parseInt(arr[0]);
				int sum=0;
				float avg=0;
				int result=0;
				for(int j=1;j<arr.length;j++) {
					sum+=Integer.parseInt(arr[j]);
				}
				avg=(float)sum/count;
				for(int j=1;j<arr.length;j++) {
					if(avg<Integer.parseInt(arr[j])) result++;
				}
				System.out.printf("%.3f%%\n", (float)result/count*100);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
