package kakao_blind_recruitment2019;

import java.util.Arrays;

public class FailureRate {
//	실패율
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
//		Integer[] answer = new Integer[N];
		float[] arr = new float[N + 1];
		for (int i : stages) {
			arr[i - 1]++;
		}
		int count = (int) arr[N];
		for (int i = N - 1; i >= 0; i--) {
			count += arr[i];
			arr[i] = arr[i] / count;
			answer[i] = i + 1;
		}
		return Arrays.stream(answer).boxed()
				.sorted((o1, o2) -> arr[o2 - 1] > arr[o1 - 1] ? 1 : arr[o2 - 1] < arr[o1 - 1] ? -1 : 0)
				.mapToInt(Integer::valueOf).toArray();
//		Arrays.sort(answer, (o1, o2) -> arr[o2 - 1] > arr[o1 - 1] ? 1 : arr[o2 - 1] < arr[o1 - 1] ? -1 : 0);
//		return Arrays.stream(answer).mapToInt(Integer::valueOf).toArray();
	}

//	public Integer[] solution(int N, int[] stages) {
//		Integer[] answer = new Integer[N];
//		float[] arr = new float[N + 1];
//		Arrays.sort(stages);
//		for (int i = 1; i <= N; i++) {
//			int clear = 0;
//			int fail = 0;
//			for (int j = 0; j < stages.length; j++) {
//				if (stages[j] == i)
//					fail++;
//				if (stages[j] >= i)
//					clear++;
//			}
//			arr[i - 1] = clear == 0 ? 0 : (float) fail / clear;
//			answer[i - 1] = i;
//		}
//
//		float[] arr2 = Arrays.copyOf(arr, N);
//		Arrays.sort(arr2);
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				if (arr2[N - i - 1] == arr[j]) {
//					arr[j] = -1;
//					answer[i] = j + 1;
//					break;
//				}
//			}
//		}
//		return answer;
//	}
}