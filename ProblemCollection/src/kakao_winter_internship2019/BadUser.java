package kakao_winter_internship2019;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadUser {
    public int solution(String[] user_id, String[] banned_id) {
        HashSet<String> hs=new HashSet<String>();
		boolean[] checked=new boolean[user_id.length];
		for(int i=0;i<banned_id.length;i++) {
			banned_id[i]=banned_id[i].replaceAll("\\*", "(\\\\w)");
		}
		recursion(user_id, banned_id, checked, hs, 0);
        return hs.size();
    }

	public void recursion(String[] user_id, String[] banned_id, boolean[] checked, HashSet<String> hs, int x) {
		if(banned_id.length<=x) {
			StringBuffer s=new StringBuffer();
			for(int i=0;i<checked.length;i++) {
				if(checked[i]) s.append(i);
			}
			hs.add(s.toString());
			return;
		}
		
		Pattern p=Pattern.compile(banned_id[x]);
		for(int i=0;i<user_id.length;i++) {
			Matcher m=p.matcher(user_id[i]);
			if(!checked[i] && m.find() && m.group().equals(user_id[i])) {
				checked[i]=true;
				recursion(user_id, banned_id, checked, hs, x+1);
				checked[i]=false;
			}
		}
	}
}
