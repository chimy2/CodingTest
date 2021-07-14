package kakao_winter_internship2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Tuple {
    public int[] solution(String s) {
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        String[] arr=s.substring(2, s.length()-1).split("[{},]{1,}");
        for(int i=0;i<arr.length;i++) {
            hm.put(arr[i], hm.containsKey(arr[i])? hm.get(arr[i])+1 : 1);
        }

        int[] answer=new int[hm.size()];
        List<Entry<String, Integer>> li=new ArrayList<Entry<String,Integer>>(hm.entrySet());
        Collections.sort(li, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        for(int i=0;i<li.size();i++) {
            answer[i]=Integer.parseInt(li.get(i).getKey());
        }
        return answer;
    }
}
