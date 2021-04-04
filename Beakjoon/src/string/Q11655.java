package string;

import java.io.*;

public class Q11655 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>=65&&c<=90) {
				c=(char)(c>77?c-13:c+13);
			} else if(c>=97&&c<=122) {
				c=(char)(c>109?c-13:c+13);
			} 
			System.out.print(c);
		}
	}
}
