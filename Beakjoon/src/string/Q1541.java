package string;

import java.io.*;

public class Q1541 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] arrs=br.readLine().split("-");
		int answer=0;
		for(int i=0;i<arrs.length;i++) {
			String[] arr=arrs[i].split("\\+");
			for(int j=0;j<arr.length;j++) {
				int num=Integer.parseInt(arr[j]);
				if(i==0) {
					answer+=num;
				} else {
					answer-=num;
				}
			}
		}
		System.out.println(answer);
	}
}
