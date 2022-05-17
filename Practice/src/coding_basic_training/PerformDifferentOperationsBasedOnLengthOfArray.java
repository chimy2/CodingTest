package coding_basic_training;

public class PerformDifferentOperationsBasedOnLengthOfArray {
//	배열의 길이에 따라 다른 연산하기
	public int[] solution(int[] arr, int n) {
		for (int i = 0; i < (arr.length + 1) / 2; i++) {
			arr[arr.length % 2 == 0 ? i * 2 + 1 : i * 2] += n;
		}
		return arr;
	}
}