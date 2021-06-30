
package kakao_code_qualifier2017;

import java.util.ArrayList;
import java.util.List;

public class KakaoFriendColoringBook {
//	이유는 모르지만 매개변수 picture 배열을 복사한 배열을 수정하고
//	전역변수로 선언했던 List를 함수 안에서 선언하니 통과됨
    public int[] solution(int m, int n, int[][] picture) {
        List<Integer> li=new ArrayList<Integer>();
        int[][] arr=new int[m][n];
		int[] answer=new int[2];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=picture[i][j];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]!=0) {
					rotate(li, arr, i, j, arr[i][j], li.size());
				}
			}
		}
		answer[0]=li.size();
		for(int i=0;i<li.size();i++) {
			if(answer[1]<li.get(i)) answer[1]=li.get(i);
		}
        return answer;
    }
    
    public static void rotate(List<Integer> li, int[][] arr, int i, int j, int k, int l) {
		if(i<0 || i>=arr.length || j<0 || j>=arr[i].length
				|| arr[i][j]!=k) return;
		arr[i][j]=0;
		if(li.isEmpty() || li.size()<=l) {
			li.add(1);
		} else {
			li.set(l, li.get(l)+1);
		}
		rotate(li, arr, i-1,j, k, l);
		rotate(li, arr, i+1,j, k, l);
		rotate(li, arr, i,j-1, k, l);
		rotate(li, arr, i,j+1, k, l);
	}
}
