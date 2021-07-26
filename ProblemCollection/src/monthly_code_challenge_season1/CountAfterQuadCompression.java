package monthly_code_challenge_season1;

public class CountAfterQuadCompression {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        boolean[][] state=new boolean[arr.length][arr[0].length];
        for(int i=2;i<=arr.length;i*=2) {
            for(int j=0;j<arr.length;j+=i){
                for(int k=0;k<arr[j].length;k+=i) {
                    if(check(arr, j, k, i)) compress(state, j, k, i);
                }
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(!state[i][j]) answer[arr[i][j]]++;
            }
        }
        return answer;
    }
    
    public boolean check(int[][] arr, int x, int y, int n) {
        boolean result=true;
        int first=arr[x][y];
        for(int i=x;i<x+n && result;i++) {
            for(int j=y;j<y+n;j++) {
                if(arr[i][j]!=first) {
                    result=false;
                    break;
                } 
            }
        }
        return result;
    } 
    
    public void compress(boolean[][] state, int x, int y, int n) {
        for(int i=x;i<x+n;i++) { 
            for(int j=y;j<y+n;j++) {
                if(i==x && j==y) continue;
                state[i][j]=true;
            }
        }
    }
}
