package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8958 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] answer=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<answer.length;i++) {
			String s=br.readLine();
			int num=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='O') {
					answer[i]+=++num;
				}else {
					num=0;
				}
			}
		}			
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
