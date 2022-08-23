package introduction_coding_tests;

import java.util.Arrays;

public class ClosestNumber {
//	가까운 수
	public int solution(int[] array, int n) {
		return Arrays.stream(array).reduce(200, (p, c) -> {
			int a = Math.abs(n - p);
			int b = Math.abs(n - c);
			if (a == b && p < c || a < b) {
				return p;
			} else {
				return c;
			}
		});
	}
}