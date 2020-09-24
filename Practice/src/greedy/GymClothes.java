package greedy;

public class GymClothes {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] check=new boolean[n+1];
		for(int i=0;i<check.length;i++) {
			check[i]=true;
		}
		for(int i:lost) {
			check[i]=false;
		}
		for(int i=0;i<reserve.length;i++) {
			if(!check[reserve[i]]) {
				check[reserve[i]]=true;
				reserve[i]=0;
			}
		}
		for(int i=0;i<reserve.length;i++) {
			if(reserve[i]==0) continue;
			else if(reserve[i]==1) {
				if(!check[reserve[i]+1]) {
					check[reserve[i]+1]=true;
					reserve[i]=0;
				}
			}else if(reserve[i]==n) {
				if(!check[reserve[i]-1]) {
					check[reserve[i]-1]=true;
					reserve[i]=0;
				}
			}else if(!check[reserve[i]-1]) {
				check[reserve[i]-1]=true;
				reserve[i]=0;
			}else if(!check[reserve[i]+1]) {
				check[reserve[i]+1]=true;
				reserve[i]=0;
			}
		}for(int i=1;i<check.length;i++) {
			if(check[i])answer++;
		}
        return answer;
    }
}
