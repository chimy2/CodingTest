package exercise;

import java.util.Arrays;
import java.util.Collections;

public class StringDescendingPlacement {
    public String solution(String s) {
		StringBuffer sb=new StringBuffer();
        Integer[] a=new Integer[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i)/1;
        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.length;i++) sb.append((char)a[i].intValue());
        return sb.toString();
    }
}
