package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2753 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			boolean result=false;
			if(n%4==0 && n%100!=0 || n%400==0) {
				result=true;
			}
			System.out.println(result ? 1 : 0);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
