package kakao_internship2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeFormula {
	public static void main(String[] args) {
		String expression="100-200*300-500+20";
        long answer = 0;
        StringBuffer sb=new StringBuffer();
        List<Integer> num=new ArrayList<Integer>();
        List<Character> op=new ArrayList<Character>();
        for(int i=0;i<expression.length();i++) {
        	char c=expression.charAt(i);
        	if(Character.isDigit(c)) {
        		sb.append(c);
        	} else {
        		num.add(Integer.parseInt(sb.toString()));
        		sb.setLength(0);
        		op.add(c);
        	}
        	if(i==expression.length()-1) num.add(Integer.parseInt(sb.toString()));
        }
        System.out.println(num);
        System.out.println(op);
        System.out.println(answer);
	}
}
