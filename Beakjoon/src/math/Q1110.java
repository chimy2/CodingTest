package math;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int origin=Integer.parseInt(br.readLine());
		int num=origin;
		int answer=0;
		do {
			num=(num%10)*10+(num/10+num%10)%10;
			answer++;
		}while(origin!=num);
		System.out.println(answer);
	}
}
