package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10998 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String s=br.readLine();
			System.out.println(Character.getNumericValue(s.charAt(0))*Character.getNumericValue(s.charAt(2)));
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
