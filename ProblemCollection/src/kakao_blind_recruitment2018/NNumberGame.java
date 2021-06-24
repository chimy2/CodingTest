package kakao_blind_recruitment2018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NNumberGame {
	public static void main(String[] args) {
//		int n=2, t=4, m=2, p=1;
		int n=16, t=16, m=2, p=1;
//		n-진법, t-구할갯수, m-게임참가인원, p-순서
		StringBuffer sb=new StringBuffer();
		List<Character> li=new ArrayList<Character>();
		for(int i=0,j=0;j<t*m;j++) {
			int num=j;
			do {
				System.out.println(Character.forDigit(num%n, 2));
				li.add((char) (num%n+48));
				num/=n;
			} while(num>0);
		}
		for(int i=0;i<t;i++) {
			sb.append(li.get(i*m+p));
		}
		System.out.println(li);
		System.out.println(sb);
	}
}
