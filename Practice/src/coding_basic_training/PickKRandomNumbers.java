package coding_basic_training;

public class PickKRandomNumbers {
//	무작위로 K개의 수 뽑기
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		for (int i = 0, j = 0; j < k;) {
			if (i >= arr.length) {
				answer[j++] = -1;
			} else if (i == 0) {
				answer[j++] = arr[i++];
			} else {
				for (int l = 0; l < j; l++) {
					if (arr[i] == answer[l]) {
						break;
					}
					if (l == j - 1) {
						answer[j++] = arr[i];
					}
				}
				i++;
			}
		}
		return answer;
//		return IntStream.concat(Arrays.stream(arr).distinct(), IntStream.range(0, k).map(i -> -1)).limit(k).toArray();
	}
}