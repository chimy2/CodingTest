package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2577 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int su=1;
		int[] answer=new int[10];
		for(int i=0;i<3;i++) {
			su*=Integer.parseInt(br.readLine());
		}
		String s=String.valueOf(su);
		for(int i=0;i<s.length();i++) {
			int c=Character.getNumericValue(s.charAt(i));
			answer[c]++;
		}
		for(int i:answer) {
			System.out.println(i);
		}
	}
}
