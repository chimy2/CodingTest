package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q15552 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<n;i++) {
				String[] s=br.readLine().split(" ");
				sb.append(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"\n");
			}
			System.out.println(sb);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
