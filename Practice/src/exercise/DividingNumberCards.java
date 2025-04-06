package exercise;

import java.util.ArrayList;
import java.util.List;

//	숫자 카드 나누기
public class DividingNumberCards {
	
	public int solution(int[] arrayA, int[] arrayB) {
		return Math.max(find(arrayA, arrayB), find(arrayB, arrayA));
	}

	public int find(int[] A, int[] B) {
		List<Integer> li = new ArrayList<Integer>();
        int min = 500000;

		for (int i = 2; i <= min; i++) {

			boolean isPass = true;

            for (int j = 0; j < A.length; j++) {

                min = Math.min(min, A[j]);

                if (A[j] % i != 0) {
                    isPass = false;
                    break;
                }
			}

			if (isPass) {
                for (int j = 0; j < B.length; j++) {
                    if (B[j] % i == 0) {
                        isPass = false;
                        break;
                    }
                }
			}
            
            if(isPass) {
                li.add(i);
            }
		}

		return li.stream().mapToInt(i -> i).max().orElse(0);
	}
}