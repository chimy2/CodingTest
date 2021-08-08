package kakao_blind_recruitment2020;

public class LockAndKey {
    public boolean solution(int[][] key, int[][] lock) {
        boolean answer=false;
		int lenK=key.length;
		int lenL=lock.length;
		for(int i=0;i<4;i++) {
			for(int j=0;j<lenK+lenL-1 && !answer;j++) {
				for(int k=0;k<lenK+lenL-1 && !answer;k++) {
					for(int l=0;l<lenL*lenL;l++) {
						int x=l/lenL;
						int y=l%lenL;
						int x2=lenK-j+x-1;
						int y2=lenK-k+y-1;
						if(x2<0 || x2>=lenK || y2<0 || y2>=lenK) {
							if(lock[x][y]<1) break;
						} else if(lock[x][y]+key[x2][y2]!=1) {
                            break;
						}
						if(l==lenL*lenL-1) answer=true;
					}
				}
			} 
			key=rotate(key);
		}
        return answer;
	}
	
	public static int[][] rotate(int[][] key) {
		int[][] result=new int[key.length][key[0].length];
		for(int i=0;i<key.length;i++) {
			for(int j=0;j<key[i].length;j++) {
				result[j][result.length-i-1]=key[i][j];
			}
		}
		return result;
	}
}
