package blind_recruitment;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sZbddaad";
		StringBuffer sb=new StringBuffer();
        Integer[] a=new Integer[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i)/1;
        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.length;i++) sb.append((char)a[i].intValue());
        System.out.println(sb);
	}
}
