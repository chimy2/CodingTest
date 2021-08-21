package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2739 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=9;i++) {
				System.out.println(n+" * "+i+" = "+n*i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
