package summer_winter_coding2018;


import java.util.ArrayList;
import java.util.List;

public class VisitLength {
//	방문 길이
    public int solution(String dirs) {
		int answer=0;
		List<String> li=new ArrayList<String>();
		int pastX=0;
		int pastY=0;
		int x=0;
		int y=0;
		for(int i=0;i<dirs.length();i++) {
			char c=dirs.charAt(i);
			if(c=='U' && y<5) {
				y++;
			}else if(c=='D' && y>-5) {
				y--;
			}else if(c=='R' && x<5) {
				x++;
			}else if(c=='L' && x>-5) {
				x--;
			}
			String s1=""+pastX+pastY+x+y;
			String s2=""+x+y+pastX+pastY;
			if(!li.contains(s1) && (x!=pastX || y!=pastY)){
				li.add(s1);
				li.add(s2);
				answer++;
			}
			pastX=x;
			pastY=y;
		}
        return answer;
    }
}
