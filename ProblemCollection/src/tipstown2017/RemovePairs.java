package tipstown2017;

import java.util.Stack;

public class RemovePairs {
//	시도2
    public int solution2(String s) {
    	Stack<Character> st=new Stack<Character>();
    	for(int i=0;i<s.length();i++) {
    		if(st.isEmpty() || st.peek()!=s.charAt(i)) {
    			st.add(s.charAt(i));
    		} else {
    			st.pop();
    		}
    	}
    	return st.isEmpty()? 1:0;
    }
    
//	시도1
    public int solution(String s) {
        int i=0;
        while(i<s.length()-1) {
            if(s.charAt(i)==s.charAt(i+1)) {
                if(i==0) s=s.substring(i+2);
                else s=s.substring(0, i)+s.substring(i+2);
                i=i>0&&i+2<s.length()-1? i-1 : 0;
            } else i++;
        }
        return s.length()>0 ? 0 : 1;
    }
    
	public static void main(String[] args) {
		RemovePairs r=new RemovePairs();
		System.out.println(r.solution2("abccba"));
	}
}
