package exercise;

import java.util.Arrays;

public class DivisibleNumberArray {
//	나누어 떨어지는 숫자 배열
	public int[] solution(int[] arr, int divisor) {
		int[] answer = Arrays.stream(arr).sorted().filter(i -> i % divisor == 0).toArray();
		return answer.length > 0 ? answer : new int[] { -1 };
//		List<Integer> before = new ArrayList<Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % divisor == 0) {
//				before.add(arr[i]);
//			}
//		}
//		Collections.sort(before);
//		int[] answer = new int[before.size()];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = before.get(i);
//		}
//		return answer.length > 0 ? answer : new int[] { -1 };
	}
}