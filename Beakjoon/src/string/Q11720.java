package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String su=br.readLine();
		int answer=0;
		for(int i=0;i<num;i++) {
			answer+=Character.getNumericValue(su.charAt(i));
		}
		System.out.println(answer);
	}
}
