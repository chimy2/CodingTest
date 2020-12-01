package kakao_blind_recruitment2018;

import java.util.ArrayList;

public class Compression {
    public int[] solution(String msg) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
        int index=0, length=1;
        ArrayList<String> al=new ArrayList<String>();
        for(char i='A';i<='Z';i++) {
            al.add(i+"");
        }
        while(index<msg.length()) {
            String str=msg.substring(index, index+length);
            if(al.contains(str) && index+length<=msg.length()-1) {
                length++;
            }else if(index==msg.length()-1 || index+length==msg.length() && al.contains(str)){
                answer.add(al.indexOf(str)+1);
                index+=length;
            }else {
                al.add(str);
                answer.add(al.indexOf(str.substring(0, str.length()-1))+1);
                index+=length-1;
                length=1;
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}