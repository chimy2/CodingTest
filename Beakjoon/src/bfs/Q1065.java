package bfs;

import java.io.*;

public class Q1065 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int answer=0;;
		for(int i=1;i<=num;i++) {
			if(i<100) {
				if(num<100) {
					answer+=num;
					i+=num;
				} else {
					answer+=99;
					i+=99;
				}
			} else {
				if(i/100-i/10%10==i/10%10-i%10) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
