package hash;

import java.util.HashMap;
import java.util.Map.Entry;

public class Camouflage {
    public int solution2(String[][] clothes) {
        int answer=1;
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        for(int i=0;i<clothes.length;i++) { 
            String s=clothes[i][1];
            hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        for(Entry<String, Integer> en:hm.entrySet()) {
            answer*=en.getValue()+1;
        }
        return answer-1;
    }
	
//	85.7 / 100.0  (1, 4, 7, 26 시간초과)
	public static int answer=0;
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<clothes.length;i++) { 
			String s=clothes[i][1];
			if(hm.isEmpty() || !hm.containsKey(s)) {
				hm.put(s, 1);
			} else {
				hm.put(s, hm.getOrDefault(s, 0)+1);
			}
		}
		for(int i=1;i<=hm.size();i++) {
			for(Entry<String, Integer> en:hm.entrySet()) {
				for(int j=0;j<en.getValue();j++) {
					recursion(hm, en.getKey(), 1, i);
				}
			}
		}
		return answer;
	}
	
	public static void recursion(HashMap<String, Integer> hm, String key, int now, int count) {
		if(now==count) {
			answer++;
			return;
		}
		boolean check=false;
		
		for(Entry<String, Integer> en:hm.entrySet()) {
			for(int j=0;check && j<en.getValue();j++) {
				recursion(hm, en.getKey(), now+1, count);
			}
			if(en.getKey().equals(key)) check=true;
		}
	}
}
