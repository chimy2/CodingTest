package coding_basic_training;

public class TransformSequenceBasedOnCertainConditions2 {
//	조건에 맞게 수열 변환하기2
	public int solution(int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			while (arr[i] % 2 == 0 && arr[i] >= 50 || arr[i] % 2 == 1 && arr[i] < 50) {
				if (arr[i] < 50) {
					arr[i] = arr[i] * 2 + 1;
				} else {
					arr[i] /= 2;
				}
				temp++;
			}
			answer = Math.max(answer, temp);
		}
		return answer;
	}
}