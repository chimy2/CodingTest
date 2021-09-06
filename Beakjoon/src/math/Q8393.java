package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8393 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			int result=0;
			for(int i=1;i<=n;i++) {
				result+=i;
			}
			System.out.println(result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
