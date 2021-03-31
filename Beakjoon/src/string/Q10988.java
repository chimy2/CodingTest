package string;

import java.io.*;

public class Q10988 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int answer=1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				answer--;
				break;
			}
		}
		System.out.println(answer);
	}
}
