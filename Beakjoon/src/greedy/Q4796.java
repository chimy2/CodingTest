package greedy;

import java.io.*;

public class Q4796 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int i=1;
		while(!(s=br.readLine()).equals("0 0 0")) {
			int l=Integer.parseInt(s.split(" ")[0]);
			int p=Integer.parseInt(s.split(" ")[1]);
			int v=Integer.parseInt(s.split(" ")[2]);
			int answer=v/p*l+(v%p<=l?v%p:l);
			System.out.printf("Case %d: %d\n", i++, answer);
		}
	}
}
