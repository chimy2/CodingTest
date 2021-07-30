package monthly_code_challenge_season2;

import java.util.Stack;

public class RotatingParentheses {
    public int solution(String s) {
		int answer=0;
		for(int i=0;i<s.length();i++) {
			if(check(s)) answer++;
			s=s.substring(1)+s.charAt(0);
		}
        return answer;
	}
	
	public boolean check(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			switch (c) {
				case '[':
				case '{':
				case '(':
					st.add(c);
					break;
				case ']':
					if(!st.isEmpty() && st.peek()=='[') {
						st.pop();
						break;
					}
				case '}':
					if(!st.isEmpty() && st.peek()=='{') {
						st.pop();
						break;
					}
				case ')':
					if(!st.isEmpty() && st.peek()=='(') {
						st.pop();
						break;
					}
				default :
					return false;
			}
		}
		return st.size()>0? false : true;
	}
}
