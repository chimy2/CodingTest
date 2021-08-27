package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10818 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int n=Integer.parseInt(br.readLine());
			String[] s=br.readLine().split(" ");
			int min=0, max=0;
			for(int i=0;i<n;i++) {
				int a=Integer.parseInt(s[i]);
				if(i==0) {
					min=a;
					max=a;
				} else {
					min=Math.min(min, a);
					max=Math.max(max, a);
				}
			}
			System.out.println(min+" "+max);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
