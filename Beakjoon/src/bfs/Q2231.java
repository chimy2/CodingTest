package bfs;

import java.io.*;

public class Q2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int num=Integer.parseInt(br.readLine());
		int answer=num;
		for(int i=num;i>0;i--) {
			int su=i;
			int sum=i;
			for(;su!=0;su/=10) sum+=su%10;
			if(sum==num && i<answer) answer=i;
		}
		System.out.println(answer==num?0:answer);
	}
}
