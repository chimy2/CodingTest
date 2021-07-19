package dfs_bfs;

public class WordConversion {
	public int answer=0;
    
    public int solution(String begin, String target, String[] words) {
        boolean[] arr=new boolean[words.length];
        
		for(int i=0;i<words.length;i++) {
			if(matchWord(begin, words[i])) {
				arr[i]=true;
				dfs(words, arr, words[i], target, 1);
				arr[i]=false;
			}
		}
        
        return answer;
    }
    
	public void dfs(String[] words, boolean[] arr, String begin, String target, int n) {
		if(begin.equals(target)) {
			if(answer==0 || answer>0 && answer>n) {
				answer=n;
			}
		}
		for(int i=0;i<words.length;i++) {
			if(!arr[i] && matchWord(begin, words[i])) {
				arr[i]=true;
				dfs(words, arr, words[i], target, n+1);
				arr[i]=false;
			}
		}
	}

	public boolean matchWord(String begin, String word) {
		int count =0;
		for(int i=0;i<begin.length();i++) {
			if(begin.charAt(i)==word.charAt(i)) count++;
		}
		return count==word.length()-1 ? true : false;
	}
}
