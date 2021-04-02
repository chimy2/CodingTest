package greedy;

import java.io.*;

public class Q10162 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] arr={300, 60, 10};
		if(n%10>0) System.out.println(-1);
		else {
			for(int i=0;i<arr.length;i++) {
				int result=n/arr[i];
				if(result>0) {
					n-=result*arr[i];
				}System.out.printf("%d ", result);
			}
		}
	}
}
