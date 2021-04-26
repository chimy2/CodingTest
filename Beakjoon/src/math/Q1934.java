package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1934 {
	public static void main(String[] atgs) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		while(num--!=0) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int g=1;
			for(int i=2;i<=a&&i<=b;) {
				if(a%i==0 && b%i==0) {
					g*=i;
					a/=i;
					b/=i;
				} else {
					i++;
				}
			}
			System.out.println(g*a*b);
		}
	}
}
