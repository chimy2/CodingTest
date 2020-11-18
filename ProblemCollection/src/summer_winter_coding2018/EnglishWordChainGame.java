package summer_winter_coding2018;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChainGame {
   public int[] solution(int n, String[] words) {
        Set<String> set=new HashSet<String>();
		int[] answer= {0, 1};
		set.add(words[0]);
		for(int i=1;i<words.length;i++) {
			if(i%n==0) answer[1]++;
			if(set.contains(words[i])
				|| words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) {
				answer[0]=i%n+1;
				break;		
			}
			set.add(words[i]);
		}
        if(answer[0]==0) answer[1]=0;
        return answer;
    }
}
	