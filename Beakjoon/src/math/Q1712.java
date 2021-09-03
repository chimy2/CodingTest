package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1712 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] s=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			int c=Integer.parseInt(s[2]);
			long result=-1;
			if(c-a-b>0) {
				result=1;
			} else if(b<c) {
				result=(long)Math.ceil((double)a/(c-b));
				if((double)a/(c-b)==a/(c-b)) {
					result++;
				}
			}
			System.out.println(result);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
