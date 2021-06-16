package kakao_internship2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximizeFormula {
//	static char[] arr={'+', '-', '*'};
	static int[] output={1, 2, 3};
	static List<Integer> num=new ArrayList<Integer>();
	static List<Character> op=new ArrayList<Character>();
	static boolean[] visited=new boolean[3];
    
	public static void main(String[] args) {
		String expression="100-200*300-500+20";
        long answer = 0;
        int[] arr=new int[3];
        StringBuffer sb=new StringBuffer();
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
        per(arr, 0, 3, arr.length);
        long result=calc();
        if(result>answer) answer=result;
        System.out.println(num);
        System.out.println(op);
        System.out.println(answer);
	}
	
	static void per(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			System.out.println(Arrays.toString(output));
            calc();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                per(output, depth + 1, n, r);
                visited[i] = false;
            }
        }
	}
	
	public static long calc() {
		List<Integer> num2=new ArrayList<Integer>();
		List<Character> op2=new ArrayList<Character>();
		for(Integer su:num) {
			num2.add(su);
		}
		for(Character c:op) {
			op2.add(c);
		}
		System.out.println(num2.size());
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<op2.size();j++) {
				if(op2.get(j)==output[i]) {
					switch(output[i]) {
					case 1: 
						num2.set(j, num2.get(j)+num2.get(j+1));
						break;
					case 2: 
						num2.set(j, num2.get(j)-num2.get(j+1));
						break;
					case 3: 
						num2.set(j, num2.get(j)*num2.get(j+1));
						break;
					}
					num2.remove(j+1);
					op2.remove(j);
				}
			}
		}
		System.out.println();
		System.out.println(num2.get(0));
		return num2.get(0)<0 ? -num2.get(0) : num2.get(0);
	}
}
