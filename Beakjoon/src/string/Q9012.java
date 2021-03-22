package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			String s=br.readLine();
			int n=0;
			for(int j=0;j<s.length();j++) {
				n+=s.charAt(j)=='('?1:-1;
				if(n<0)break;
			}
			System.out.println(n==0?"YES":"NO");
		}
	}
}
