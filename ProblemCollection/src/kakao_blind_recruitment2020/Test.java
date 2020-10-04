package kakao_blind_recruitment2020;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int answer=0, index=0;
		int[] a=new int[n];
		for(int i=1;i<=n;i++) {
			if(n%i==0) a[index++]=i;
		}
		if(n<1) {
			answer=a[0];
		}else {
			while(index>=0) {
				answer+=a[index--];
			}
		}
	}
}
