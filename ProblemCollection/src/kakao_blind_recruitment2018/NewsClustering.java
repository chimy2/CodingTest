package kakao_blind_recruitment2018;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
    public int solution(String str1, String str2) {
		int count=0;
		List<String> li1=new ArrayList<String>();
		List<String> li2=new ArrayList<String>();
		addLIst(li1, str1.toLowerCase());
		addLIst(li2, str2.toLowerCase());
		if(li1.size()==0 && li2.size()==0) return 65536;
        
        boolean[] arr=new boolean[li2.size()];
		for(int i=0;i<li1.size();i++) {
			for(int j=0;j<li2.size();j++) {
				if(!arr[j] && li1.get(i).equals(li2.get(j))) {
					arr[j]=true;
					count++;
					break;
				}
			}
		}
        return (int)((float)count/(li1.size()+li2.size()-count)*65536);
    }
    
	public static void addLIst(List<String> li, String str) {
		int i=0;
		while(i<str.length()-1) {
			if(!Character.isLetter(str.charAt(i))) {
				i++;
				continue;
			} else if(!Character.isLetter(str.charAt(i+1))) {
				i+=2;
				continue;
			}
			li.add(str.substring(i, i+++2));
		}
	}
}
