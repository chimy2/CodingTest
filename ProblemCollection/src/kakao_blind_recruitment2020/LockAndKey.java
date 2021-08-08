package kakao_blind_recruitment2020;

import java.util.Arrays;

public class LockAndKey {
	public static void main(String[] args) {
		int[][] key= {{0,0,0},{1,0,0},{0,1,1}};
		int[][] lock= {{1,1,1},{1,1,0},{1,0,1}};
		
		for(int i=0;i<4;i++) {
//			for(int j=0;j<lock.length;j++) {
//				for(int k=0;k<lock[i].length;k++) {
//					int[][] result=lock.clone();
//					for(int l=key.length-1;l>=0;l--) {
//						
//					}
//				}
//			}
			key=rotate(key);
		}
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
