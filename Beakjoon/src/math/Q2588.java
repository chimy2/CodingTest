package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2588 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			int result=0;
			for(int i=0;i<3;i++) {
				int c=b%10;
				b/=10;
				result+=a*c*Math.pow(10, i);
				System.out.println(a*c);
			}
			System.out.println(result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
