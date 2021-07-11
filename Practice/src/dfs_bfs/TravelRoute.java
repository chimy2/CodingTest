package dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class TravelRoute {
//	100.0 / 100.0
    public String[] solution2(String[][] tickets) {
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
        st.add("ICN");
        for(int i=0;i<tickets.length;i++) {
            if(tickets[i][0].equals("ICN")) {
                st.add(tickets[i][1]);
                state[i]=true;
                dfs(tickets, state, st);
                if(st.size()==tickets.length+1) break;
                state[i]=false;
                st.pop();
            }
        }
        return st.toArray(String[]::new);
    }
    
    public static void dfs(String[][] t, boolean[] s, Stack<String> st) {
        for(int j=0;j<t.length;j++) {
            if(!s[j] && t[j][0].equals(st.peek())) {
                s[j]=true;
                st.add(t[j][1]);
                dfs(t, s, st);
                if(st.size()==t.length+1) return;
                st.pop();
                s[j]=false;
            }
        }
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
