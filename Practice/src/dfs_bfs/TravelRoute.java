package dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TravelRoute {
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
