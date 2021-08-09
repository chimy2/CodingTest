package weekly_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MutualEvaluation {
    public String solution(int[][] scores) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<scores.length;i++) {
        	int sum=0;
        	int count=0;
            HashMap<Integer, Integer> hm=new HashMap<>();
            for(int j=0;j<scores.length;j++) {
                if(hm.containsKey(scores[j][i])) {
                    hm.put(scores[j][i], hm.get(scores[j][i])+1);
                } else {
                    hm.put(scores[j][i], 1);
                }
            }
            
            List<Entry<Integer, Integer>> li=new ArrayList<Entry<Integer, Integer>>(hm.entrySet());
            Collections.sort(li, (o1, o2) -> o1.getKey()-o2.getKey());
            for(int j=0;j<li.size();j++) {
            	Entry<Integer, Integer> lj=li.get(j);
            	if(!((j==0 || j==li.size()-1) 
            			&& lj.getKey()==scores[i][i]
            			&& lj.getValue()==1)) {
            		sum+=lj.getKey()*lj.getValue();
            		count+=lj.getValue();
            	}
            }
            
            int avg=sum/count;
            if(avg>=90) {
            	sb.append('A');
            } else if(avg>=80) {
            	sb.append('B');
            } else if(avg>=70) {
            	sb.append('C');
            } else if(avg>=50) {
            	sb.append('D');
            } else {
            	sb.append('F');
            } 
        }
        return sb.toString();
    }
}
