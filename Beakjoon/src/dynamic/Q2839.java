package dynamic;

import java.util.Scanner;

public class Q2839 {
//	설탕배달
//	Main 클래스로 제출
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int num=0;
		int answer=-1;
		while(num<input/3) {
			int mul=input/5-num;
			if((input-5*mul)%3 == 0) {
				answer=mul+(input-5*mul)/3;
				break;
			}
			num++;
		}
		System.out.println(answer);
	}
}
