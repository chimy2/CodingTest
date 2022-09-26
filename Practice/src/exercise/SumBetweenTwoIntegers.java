package exercise;

import java.util.stream.LongStream;

public class SumBetweenTwoIntegers {
//	두 정수 사이의 합
	public long solution(int a, int b) {
		return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).reduce(0, (ac, c) -> ac + c);
//		return a == b ? a : (Math.max(a, b) * (Math.max(a, b) + 1) - (Math.min(a, b) - 1) * (Math.min(a, b))) / 2;
	}
}
