package greedy;

import java.io.*;

public class Q5585 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=1000-Integer.parseInt(br.readLine());
		int answer=0;
		int[] arr= {500, 100, 50, 10, 5, 1};
		for(int i=0;i<arr.length&&num!=0;i++) {
			int result=num/arr[i];
			if(result>0) {
				answer+=result;
				num-=result*arr[i];
			}
		}
		System.out.println(answer);
	}
}
