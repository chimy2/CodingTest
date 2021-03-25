package string;

import java.io.*;

public class Q2902 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split("-");
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i].charAt(0));
		}
	}
}
