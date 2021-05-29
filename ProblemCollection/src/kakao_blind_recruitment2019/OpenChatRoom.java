package kakao_blind_recruitment2019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OpenChatRoom {
    public String[] solution(String[] record) {
        String[] answer={};
        List<String> li=new ArrayList<String>();
        HashMap<String, String> hm=new HashMap<String, String>();
        for(int i=0;i<record.length;i++) {
            String[] s=record[i].split(" ");
            if(s[0].equals("Enter")) {
                hm.put(s[1], s[2]);
                li.add(s[1]);
                li.add("님이 들어왔습니다.");
            } else if(s[0].equals("Leave")) {
                li.add(s[1]);
                li.add("님이 나갔습니다.");
            } else {
                hm.put(s[1], s[2]);
            }
        }
        
        answer=new String[li.size()/2];
        for(int i=0;i<answer.length;i++) {
            answer[i]=hm.get(li.get(i*2))+li.get(i*2+1);
        }
        return answer;
    }
}
