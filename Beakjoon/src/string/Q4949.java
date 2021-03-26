package string;

import java.io.*;
import java.util.Stack;

public class Q4949 {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s=br.readLine()).equals(".")) {
			String answer="yes";
			Stack<Character> st=new Stack<Character>();
			for(int i=0;i<s.length();i++) {
				char c=s.charAt(i);
				switch(c) {
					case '(':
					case '[': 
						st.push(c);
						break;
					case ')': 
						if(st.empty() || st.peek()!='(') {
							answer="no";
						} else {
							st.pop();
						}
						break;
					case ']': 
						if(st.empty() || st.peek()!='[') {
							answer="no";
						} else {
							st.pop();
						}
						break;
					default:
				}
				if(answer.equals("no")) break;
			}
			System.out.println(st.empty()?answer:"no");
		}
	}
}
