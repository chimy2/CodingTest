package implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2439 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++) {
				System.out.println(" ".repeat(n-i)+"*".repeat(i));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
