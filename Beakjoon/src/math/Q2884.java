package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2884 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			int m=Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
			m+=23*60+15;
			System.out.println(m/60%24+" "+m%60);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
