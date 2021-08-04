package kakao_internship2020;

import java.util.HashMap;

public class JewelryShopping {
//	100.0 / 100.0
    public int[] solution4(String[] gems) {
        int[] answer = {1, gems.length};
        int min=0;
        int max=0;
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        for(int i=0;i<gems.length;i++) {
            hm.put(gems[i], hm.containsKey(gems[i]) ? hm.get(gems[i])+1 : 1);
        }
        
        int len=hm.size();
        hm.clear();
        while(true) {
        	if(hm.size()<len) {
        		if(max+1>gems.length) break;
        		hm.put(gems[max], hm.containsKey(gems[max]) ? hm.get(gems[max])+1 : 1);
        		max++;
        	} else {
        		if(hm.get(gems[min])==1) {
        			hm.remove(gems[min]);
        		} else {
        			hm.put(gems[min], hm.get(gems[min])-1);
        		}
    			min++;        		
        	}
        	if(len==hm.size() && max-min-1<answer[1]-answer[0]) {
        		answer[0]=min+1;
        		answer[1]=max;
        	}
        }
        return answer;
    }
	
//	35.6 / 100.0
    public int[] solution3(String[] gems) {
    	int[] answer = {1, gems.length};
        int min=1;
        int max=gems.length;
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        HashMap<String, Integer> hm2=new HashMap<String, Integer>();
        String s="";
        for(int i=0;i<gems.length;i++) {
            hm.put(gems[i], hm.containsKey(gems[i]) ? hm.get(gems[i])+1 : 1);
        }
        
        hm2.putAll(hm);
        while(true) {
        	if(hm.get((s=gems[answer[1]-1]))>1) {
        		hm.put(s, hm.get(s)-1);
        		answer[1]--;
        	} else if(hm.get((s=gems[answer[0]-1]))>1) {
        		hm.put(s, hm.get(s)-1);
        		answer[0]++;
        	} else {
        		break;
        	}
        }
        while(true) {
        	if(hm2.get((s=gems[min-1]))>1) {
        		hm2.put(s, hm2.get(s)-1);
        		min++;
        	} else if(hm2.get((s=gems[max-1]))>1) {
        		hm2.put(s, hm2.get(s)-1);
        		max--;
        	} else {
        		break;
        	}
        }
        if(max-min < answer[1]-answer[0]) {
        	answer[0]=min;
        	answer[1]=max;
        }
        return answer;
    }

//	28.9 / 100.0
	public int[] solution2(String[] gems) {
	    int[] answer = {1, gems.length};
	    HashMap<String, Integer> hm=new HashMap<String, Integer>();
	    String s="";
	    for(int i=0;i<gems.length;i++) {
	        hm.put(gems[i], hm.containsKey(gems[i]) ? hm.get(gems[i])+1 : 1);
	    }
	    while(true) {
	    	if(hm.get((s=gems[answer[1]-1]))>1) {
	    		hm.put(s, hm.get(s)-1);
	    		answer[1]--;
	    	} else if(hm.get((s=gems[answer[0]-1]))>1) {
	    		hm.put(s, hm.get(s)-1);
	    		answer[0]++;
	    	} else {
	    		int count=0;
	    		while(answer[1]+count<gems.length 
	    				&& gems[answer[0]+count-1].equals(gems[answer[1]+count])) count++;
	    		int min=answer[0]+count-1;
	    		int max=answer[1]+count-1;
	    		while(hm.get((s=gems[min]))>1) {
	    			min++;
	    			hm.put(s, hm.get(s)-1);
	    		}
	    		if(max-min<answer[1]-answer[0]) {
	    			answer[0]=min+1;
	    			answer[1]=max+1;
	    		}
	    		break;
	    	}
	    }
	    return answer;
	}
	
//	28.9 / 100.0
    public int[] solution(String[] gems) {
        int[] answer = {1, gems.length};
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        String s="";
        for(int i=0;i<gems.length;i++) {
            hm.put(gems[i], hm.containsKey(gems[i]) ? hm.get(gems[i])+1 : 1);
        }
        while(true) {
        	if(hm.get((s=gems[answer[1]-1]))>1) {
        		hm.put(s, hm.get(s)-1);
        		answer[1]--;
        	} else if(hm.get((s=gems[answer[0]-1]))>1) {
        		hm.put(s, hm.get(s)-1);
        		answer[0]++;
        	} else {
        		break;
        	}
        }
        return answer;
    }
}
