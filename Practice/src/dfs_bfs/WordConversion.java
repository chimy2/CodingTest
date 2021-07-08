package dfs_bfs;

import java.util.Arrays;
import java.util.List;

public class WordConversion {
	public static void main(String[] args) {
		String begin="hit", target="cog";
		String[] words= {"hot", "dot", "dog", "lot", "log", "cog"};

        int answer = 51;
        List<String> li=Arrays.asList(words);
//        char[] c=new char[target.length()];
        boolean[] state=new boolean[li.size()];
//        for(int i=0;i<c.length;i++) {
//            c[i]=target.charAt(i);
//            if(c[i]==begin.charAt(i)) state[i]=true;
//        }
//		answer=Math.min(answer, dfs(li, c, state, target, i, 1));
        if(li.contains(target)){
        	for(int i=0;i<li.size();i++) {
            	if(checkString(begin, li.get(i)))
        		answer=Math.min(answer, dfs(li, li.get(i), target, state, i, 1));
        	}
        }
        System.out.println(li);
        System.out.println(answer);
    }
    
    public static int dfs(List<String> li, String begin, String target, boolean[] state, int idx, int count) {
    	if(begin.equals(target)) {
    		System.out.println("도착");
    		return count;
    	}
    	state[idx]=true;
    	System.out.println(Arrays.toString(state));
        for(int i=0;i<li.size();i++) {
        	System.out.println(i);
        	if(i!=idx && !state[i] && checkString(begin, li.get(i)))
    		return dfs(li, li.get(i), target, state, i, count+1);
        }
		return 0;
    }
    
    public static boolean checkString(String s1, String s2) {
    	int count=0;
    	for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)!=s2.charAt(i)) count++;
    	}
    	System.out.println("count="+count);
    	return count==1;
    }
}
