package Find_Programming_Meister;

public class GameMapShortestDistance {
//	25.6 / 100.0
	static boolean[][] visited;
	static int answer=-1;
    
    public int solution(int[][] maps) {
        visited=new boolean[maps.length][maps[0].length];
		visited[0][0]=true;
		dfs(maps, 0, 0, 1);
        return answer;
    }
    
	public static void dfs(int[][] maps, int i, int j, int count) {
		if(i==maps.length-1 && j==maps[i].length-1 
				&& (answer==-1 || answer>0 && answer>count)) {
			answer=count;
		}
		if(i>0 && !visited[i-1][j] && maps[i-1][j]==1) {
			visited[i-1][j]=true;
			dfs(maps, i-1, j, count+1);
			visited[i-1][j]=false;
		}
		if(i<maps.length-1 && !visited[i+1][j] && maps[i+1][j]==1) {
			visited[i+1][j]=true;
			dfs(maps, i+1, j, count+1);
			visited[i+1][j]=false;
		}
		if(j>0 && !visited[i][j-1] && maps[i][j-1]==1) {
			visited[i][j-1]=true;
			dfs(maps, i, j-1, count+1);
			visited[i][j-1]=false;
		}
		if(j<maps.length-1 && !visited[i][j+1] && maps[i][j+1]==1) {
			visited[i][j+1]=true;
			dfs(maps, i, j+1, count+1);
			visited[i][j+1]=false;
		}
	}
}
