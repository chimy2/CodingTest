package kakao_internship2020;

import java.util.ArrayList;
import java.util.List;

public class MaximizeFormula {
    public int[] output=new int[3];
    public List<Long> num=new ArrayList<Long>();
    public List<Integer> op=new ArrayList<Integer>();
    public boolean[] visited=new boolean[3];
    public long answer=0;

    public long solution(String expression) {
        int[] arr={1, 2, 3};
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<expression.length();i++) {
            char c=expression.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
            } else {
                num.add(Long.parseLong(sb.toString()));
                sb.setLength(0);
                switch(c) {
                case '+':
                    op.add(1);
                    break;
                case '-':
                    op.add(2);
                    break;
                case '*':
                    op.add(3);
                    break;
                }
            }
            if(i==expression.length()-1) num.add(Long.parseLong(sb.toString()));
        }
        per(arr, 0, 3, arr.length);
        return answer;
    }

    public void per(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            long result=calc();
            if(result>answer) answer=result;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                per(arr, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }

    public long calc() {
        List<Long> num2=new ArrayList<Long>();
        List<Integer> op2=new ArrayList<Integer>();
        for(Long su:num) {
            num2.add(su);
        }
        for(Integer su:op) {
            op2.add(su);
        }
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
                    op2.remove(j--);
                }
            }
        }
        return num2.get(0)<0 ? -num2.get(0) : num2.get(0);
    }
}
