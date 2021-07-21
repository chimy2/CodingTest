package heap;

import java.util.LinkedList;
import java.util.List;

public class DoublePriorityQueue {
    public int[] solution(String[] operations) {
        int[] answer=new int[2];
        List<Integer> li=new LinkedList<Integer>();
        for(int i=0;i<operations.length;i++) {
            String[] s=operations[i].split(" ");
            if(s[0].equals("I")) {
                int num=Integer.parseInt(s[1]);
                if(li.isEmpty()) {
                    li.add(num);
                } else {
                    for(int j=0;j<li.size();j++) {
                        if(num<li.get(j)) {
                            li.add(j, num);
                            break;
                        }
                        if(j==li.size()-1) {
                            li.add(num);
                            break;
                        }
                    }
                }
            } else if(!li.isEmpty()) {
                if(s[1].equals("1")){
                    li.remove(li.size()-1);
                } else {
                    li.remove(0);
                }
            }
        }
        answer[0]=li.isEmpty() ? 0 : li.get(li.size()-1);
        answer[1]=li.isEmpty() ? 0 : li.get(0);
        return answer;
    }
}
