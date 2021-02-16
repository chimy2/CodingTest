package dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1932 {
//	정수 삼각형
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		int[] arr=new int[size];
		int answer=0;
		int[] beforeArr=new int[0];
		int[] afterArr=new int[0];
		for(int i=0;i<size;i++) {
			afterArr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j=0;j<=i&&i>0;j++) {
				if(j==0) {
					afterArr[j]+=beforeArr[j];
				}else if(j==i) {
					afterArr[j]+=beforeArr[j-1];
				}else {
					afterArr[j]+=Math.max(beforeArr[j], beforeArr[j-1]);
				}
				
			}
			beforeArr=afterArr;
		}
		for(int a:afterArr) {
			answer=Math.max(answer, a);
		}
		System.out.println(answer);
	}
}