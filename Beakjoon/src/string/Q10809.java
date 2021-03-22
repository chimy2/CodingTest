package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10809 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		for(int i=0;i<26;i++) {
			System.out.printf("%d ",s.indexOf('a'+i));
		}
	}
}
