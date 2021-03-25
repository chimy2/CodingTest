package string;

import java.io.*;

public class Q1100 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int answer=0;
		for(int i=0;i<8;i++) {
			String s=br.readLine();
			for(int j=0;j<4;j++) {
				if(i%2==0 && s.charAt(j*2)=='F'
						|| i%2==1 && s.charAt(j*2+1)=='F') {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
