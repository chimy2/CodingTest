package kakao_blind_recruitment2018;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

public class Cache {
	//80.0 / 100.0
    public int solution(int cacheSize, String[] cities) {
		Queue<String> citiesQ=new LinkedList<String>();
		int time=0;
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(int i=0;i<cities.length;i++) {
			citiesQ.add(cities[i]);
		}
		if(cacheSize<1) {
			time=cities.length*5;
		}else {
			while(!citiesQ.isEmpty()) {
				String now=citiesQ.peek();
				boolean check=false;
				for(Entry<String, Integer> entry:map.entrySet()) {
					if(now.equalsIgnoreCase(entry.getKey())) {
						check=true;
						break;
					}
				}
				if(!check) {
					if(map.size()<cacheSize) {
						map.put(citiesQ.poll(), time);
					}else {
						int min=Collections.min(map.values());
						String key="";
						for(Entry<String, Integer> ent:map.entrySet()) {
							if(min==ent.getValue()) {
								key=ent.getKey();
							}
						};
						map.remove(key);
						map.put(citiesQ.poll(), time);
					}
					time+=5;
				}else {
					map.replace(citiesQ.poll(), time);
					time++;
				}
			}
		}
        return time;
    }
}
