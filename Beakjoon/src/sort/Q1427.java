package sort;

import java.io.BufferedReader;

public class Q1427 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
		int[] arr=new int[10];
		String s=br.readLine();
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.length()-s.replaceAll(""+i, "").length();
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print((i+"").repeat(arr[i]));
		}
	}
}
