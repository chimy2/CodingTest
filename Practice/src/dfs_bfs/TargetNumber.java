package dfs_bfs;

public class TargetNumber {

    public boolean[] arr;
    public int count=0;
    public int t=0;
    public int solution(int[] numbers, int target) {
        arr=new boolean[numbers.length];
        t=target;
        dfs(numbers, 0);
        return count;
    }
    
    public void dfs(int[] numbers, int index) {
        if(index>=arr.length) {
            int su=0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]) su+=numbers[i];
                else su-=numbers[i];
            }
            if(su==t) count++;
            return;
        }
        dfs(numbers, index+1);
        arr[index]=true;
        dfs(numbers, index+1);
        arr[index]=false;
    }
}
