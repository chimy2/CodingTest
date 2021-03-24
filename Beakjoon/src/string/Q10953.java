package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10953 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			String s=br.readLine();
			System.out.println(Integer.parseInt(s.split(",")[0])+Integer.parseInt(s.split(",")[1]));
		}
	}
}
