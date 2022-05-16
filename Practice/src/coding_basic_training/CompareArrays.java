package coding_basic_training;

import java.util.Arrays;

public class CompareArrays {
//	배열 비교하기
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		if (arr1.length > arr2.length) {
			answer = 1;
		} else if (arr1.length < arr2.length) {
			answer = -1;
		} else {
			int a = Arrays.stream(arr1).sum();
			int b = Arrays.stream(arr2).sum();
			if (a > b)
				answer = 1;
			else if (a < b)
				answer = -1;
		}
		return answer;
	}
}