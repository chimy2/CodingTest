package dfs_bfs;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] state=new boolean[n];
        for(int i=0;i<n;i++) {
            if(!state[i]) {
                state[i]=true;
                dfs(computers, state, i);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int[][] com, boolean[] state, int i) {
        for(int j=0;j<com.length;j++) {
            if(i!=j && com[i][j]==1 && !state[j]) {
                state[j]=true;
                dfs(com, state, j);
            }
        }
    }
}
