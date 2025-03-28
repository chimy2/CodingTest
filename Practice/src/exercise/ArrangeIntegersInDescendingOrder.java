package exercise;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrangeIntegersInDescendingOrder {
//	정수 내림차순으로 배치하기
	public long solution(long n) {
		return Long.valueOf(Arrays.stream(String.valueOf(n).split("")).sorted((o1, o2) -> o2.compareTo(o1))
				.collect(Collectors.joining()));
//		int[] arr = new int[(int) Math.log10(n) + 1];
//		long result = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (n / Math.pow(10, arr.length - i - 1));
//			n -= arr[i] * Math.pow(10, arr.length - i - 1);
//		}
//		for (int i = 0; i < arr.length; i++) {
//			int max = i;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[max] < arr[j])
//					max = j;
//			}
//			int temp = arr[i];
//			arr[i] = arr[max];
//			arr[max] = temp;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			result += arr[i] * Math.pow(10, arr.length - i - 1);
//		}
//		return result;
	}
}