package greedy;

import java.util.Stack;

public class CreateLargeNumber {
	//큰 수 만들기
    public String solution2(String number, int k) {
		int count=0;
		Stack<Character> st=new Stack<Character>();
		StringBuffer sb=new StringBuffer();
		st.add(number.charAt(0));
		for(int i=1;i<number.length();i++) {
			char c=number.charAt(i);
			while(!st.isEmpty() && st.peek()<c && count<k) {
				st.pop();
				count++;
			} 
			st.add(c);
		}
		for(int i=0;i<st.size();i++) {
			sb.append(st.get(i));
		}
		sb.setLength(number.length()-k);
        return sb.toString();
    }
	
    //83.3 / 100.0
    public String solution(String number, int k) {
    	String answer="";
		boolean check=true;
		char ch=number.charAt(0);
		for(int i=1;i<number.length();i++) {
			if(ch!=number.charAt(i)) check=false;
		}
		if(check) {
			number=number.substring(k);
		}else {
			for(int i=0;i<number.length()-1;i++) {
				if(Character.getNumericValue(number.charAt(i))==9) continue;
				for(int j=i+1;j<k+i+1&&j<number.length();j++) {
					if(number.charAt(i)<number.charAt(j)) {
						number=number.substring(0,i)+number.substring(i+1);
						i--;
						k--;
						break;
					}
				}
			}
		}
        return number;
    }
}
