package string;

import java.io.*;

public class Q1212 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringBuffer answer=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			int su=Character.getNumericValue(s.charAt(i));
			if(su/4>=1) {
				su-=4;
				answer.append("1");
			} else {
				answer.append("0");
			} if(su/2>=1) {
				su-=2;
				answer.append("1");
			} else {
				answer.append("0");
			} if(su/1>=1) {
				su-=1;
				answer.append("1");
			} else {
				answer.append("0");
			}
		}
		s=answer.toString().replaceFirst("^0{1,}", "");
		System.out.println(s.equals("")?"0":s);
	}
}
