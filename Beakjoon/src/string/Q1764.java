package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Q1764 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String su=br.readLine();
		int num1=Integer.parseInt(su.split(" ")[0]);
		int num2=Integer.parseInt(su.split(" ")[1]);
		TreeSet<String> ts=new TreeSet<String>();
		TreeSet<String> ts2=new TreeSet<String>();
		for(int i=0;i<(num1+num2);i++) {
			String s=br.readLine();
			if(num1>i) {
				ts.add(s);
			}else if(ts.contains(s)) {
				ts2.add(s);
			}
		}
		System.out.println(ts2.size());
		for(String s:ts2) {
			System.out.println(s);
		}
	}
}
