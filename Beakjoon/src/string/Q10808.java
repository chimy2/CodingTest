package string;

import java.io.*;

public class Q10808 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[(int)s.charAt(i)-97]++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
