package introduction_coding_tests;

import java.util.stream.IntStream;

public class CountOfK {
//	k의 개수
	public int solution(int i, int j, int k) {
		return IntStream.rangeClosed(i, j)
				.map(x -> String.valueOf(x).chars().reduce(0, (ac, c) -> ac + (k + '0' == c ? 1 : 0))).sum();
	}
}