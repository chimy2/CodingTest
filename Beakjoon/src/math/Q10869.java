package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10869 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			int A=Integer.parseInt(s[0]);
			int B=Integer.parseInt(s[1]);
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
