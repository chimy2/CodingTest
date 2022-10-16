package exercise;

import java.util.Arrays;

public class CalculateAverage {
//	평균 구하기
	public double solution(int[] arr) {
		return Arrays.stream(arr).average().orElse(0);
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++)
//			sum += arr[i];
//		return (double) sum / arr.length;
	}
}