package math;

import java.io.*;
import java.util.StringTokenizer;

public class Q10430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		System.out.printf("%d\n%d\n%d\n%d", (a+b)%c, 
				((a%c)+(b%c))%c, a*b%c, (a%c)*(b%c)%c);
	}
}
