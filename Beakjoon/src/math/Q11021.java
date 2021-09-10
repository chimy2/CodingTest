package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11021 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++) {
				String s=br.readLine();
				System.out.printf("Case #%d: %d\n", i, Character.getNumericValue(s.charAt(0))+Character.getNumericValue(s.charAt(2)));
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
