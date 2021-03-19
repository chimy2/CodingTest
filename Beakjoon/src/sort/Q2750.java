package sort;

import java.io.BufferedReader;
import java.util.Arrays;

public class Q2750 {
//	수 정렬하기
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
		int[] arr=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
