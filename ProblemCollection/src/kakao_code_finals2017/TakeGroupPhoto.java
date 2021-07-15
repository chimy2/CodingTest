package kakao_code_finals2017;

import java.util.HashSet;

public class TakeGroupPhoto {
    public int solution(int n, String[] data) {
        int answer=0;
        String s="ACFJMNRT";
        HashSet<String> hs=new HashSet<String>();
        hs.add(s);
    	while((s=permutation(s, hs))!=null);
    	for(String st:hs) {
    		boolean b=true;
    		for(int i=0;i<n&&b;i++) {
    			int x=st.indexOf(data[i].charAt(0));
    			int y=st.indexOf(data[i].charAt(2));
    			int z=Character.getNumericValue(data[i].charAt(4));
    			switch(data[i].charAt(3)) {
    			case '=':
    				if(Math.abs(x-y)-1!=z) b=false;
    				break;
    			case '>':
    				if(Math.abs(x-y)-1<=z) b=false;
    				break;
    			case '<':
    				if(Math.abs(x-y)-1>=z) b=false;
    				break;
    			}
    		}
    		answer+=b?1:0;
    	}
        return answer;
	}
    public static String permutation(String s, HashSet<String> hs) {
    	for(int i=s.length()-2;i>=0;i--) {
    		if(s.charAt(i)>s.charAt(i+1)) continue;
    		for(int j=s.length()-1;j>i;j--) {
    			if(s.charAt(i)<s.charAt(j)) {
    				s=swap(s, i, j);
    				break;
    			}
    		}
    		for(int j=i+1;j<s.length()-(s.length()-i)/2;j++) {
    			s=swap(s, j, s.length()+i-j);
    		}
        	hs.add(s);
    		return s;
    	}
    	return null;
    }
    
    public static String swap(String s, int i, int j) {
    	return s.substring(0, i)+s.charAt(j)+s.substring(i+1, j)+s.charAt(i)+s.substring(j+1);
    }
}
