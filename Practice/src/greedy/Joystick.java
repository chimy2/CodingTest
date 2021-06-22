package greedy;

public class Joystick {
    public int solution(String name) {
        int len=name.length()-1;
        int answer=0;
        for(int i=1;i<name.length();i++) {
            if(name.charAt(i)=='A') {
                for(int j=i+1;j<name.length();j++) {
                    len=Math.min(len, (i-1)*2+name.length()-j);
                    if(name.charAt(j)!='A') break;
                }
            }
        }
        for(int i=0;i<name.length();i++) {
            answer+=Math.min(name.charAt(i)-'A', '['-name.charAt(i));
        }
        return answer+len;
    }
}
