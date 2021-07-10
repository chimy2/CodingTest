package dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class TravelRoute {
	public static void main(String[] args) {
//		String[][] tickets={{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		String[][] tickets={{"ICN", "AOO"}, {"AOO", "BOO"}, {"AOO", "COO"}, {"COO", "AOO"}, {"BOO", "ZOO"}};
		Stack<String> st=new Stack<String>();
        boolean[] state=new boolean[tickets.length];
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].compareTo(o2[0])==0) {
                    return o1[1].compareTo(o2[1]);
                }
                return o1[0].compareTo(o2[0]);
            }
        });
//        for(int i=0;i<tickets.length;i++) {
//        	System.out.println(Arrays.toString(tickets[i]));
//        }
        st.add("ICN");
        for(int i=0;i<tickets.length;i++) {
            if(tickets[i][0].equals("ICN")) {
                st.add(tickets[i][1]);
                state[i]=true;
                dfs2(tickets, state, i, st);
                state[i]=false;
                st.pop();
            }
        }
        System.out.println(Arrays.toString(st.toArray(String[]::new)));
    }
    
    public static void dfs2(String[][] t, boolean[] s, int i, Stack<String> st) {
    	System.out.print("[");
    	for(int j=0;j<t.length;j++) {
	    	System.out.print(Arrays.toString(t[j])+(j!=t.length-1?", ":""));
	    }
    	System.out.println("]\n"+Arrays.toString(s));
    	System.out.println(st+"\n");
//    	if(st.size()==t.length) {
//    		System.out.println("오니"+st);
//    		return;
//    	} else {
        st.add(t[i][1]);
        for(int j=0;j<t.length;j++) {
            if(!s[j] && t[j][0].equals(t[i][1])) {
                s[j]=true;
                dfs2(t, s, j, st);
                if(st.size()==t.length) {
                	return;
                }
                s[j]=false;
            }
        }
        st.pop();
//    	}
    }
	
//	50.0 / 100.0
    public String[] solution(String[][] tickets) {
        List<String> li=new ArrayList<>();
        boolean[] state=new boolean[tickets.length];
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].compareTo(o2[0])==0) {
                    return o1[1].compareTo(o2[1]);
                }
                return o1[0].compareTo(o2[0]);
            }
        });
        for(int i=0;i<tickets.length;i++) {
            if(tickets[i][0].equals("ICN")) {
                li.add(tickets[i][0]);
                state[i]=true;
                dfs(tickets, state, i, li);
                break;
            }
        }
        return li.toArray(String[]::new);
    }
    
    public void dfs(String[][] t, boolean[] s, int i, List<String> li) {
        li.add(t[i][1]);
        for(int j=0;j<t.length;j++) {
            if(!s[j] && t[j][0].equals(t[i][1])) {
                s[j]=true;
                dfs(t, s, j, li);
            }
        }
    }
}
