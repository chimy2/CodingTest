package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1001 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			System.out.println(Integer.parseInt(s[0])-Integer.parseInt(s[1]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
