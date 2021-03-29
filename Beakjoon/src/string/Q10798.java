package string;

import java.io.*;

public class Q10798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] arr=new String[5];
		int max=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=br.readLine();
			if(arr[i].length()>max) max=arr[i].length();
		}
		for(int i=0;i<max*arr.length;i++) {
			if(arr[i%5].length()>i/5) {
				System.out.print(arr[i%5].charAt(i/5));
			}
		}
	}
}
