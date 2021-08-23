package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1330 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			String result="==";
			if(a>b) {
				result=">";
			} else if(a<b) {
				result="<";
			}
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
