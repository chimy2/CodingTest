package exercise;

import java.util.stream.LongStream;

public class NNumbersWithIntervalOfX {
//	x만큼 간격이 있는 n개의 숫자
	public long[] solution(int x, int n) {
		return LongStream.rangeClosed(1, n).map(i -> i * x).toArray();
//		long[] answer = new long[n];
//		for (int i = 1; i <= n; i++) {
//			answer[i - 1] = (long) x * i;
//		}
//		return answer;
	}
}