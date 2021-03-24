package string;

import java.io.*;
import java.util.Stack;

public class Q10773 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		Stack<Integer> st=new Stack<Integer>();
		int answer=0;
		for(int i=0;i<num;i++) {
			int su=Integer.parseInt(br.readLine());
			if(su!=0) {
				answer+=su;
				st.add(su);
			}else {
				answer-=st.pop();
			}
		}
		System.out.println(answer);
	}
}
