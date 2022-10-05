package exercise;

import java.util.stream.IntStream;

public class SumOfDivisors {
//	약수의 합
	public int solution(int n) {
		return IntStream.rangeClosed(1, n).reduce(0, (ac, c) -> n % c == 0 ? ac + c : ac);
//		int answer = 0, index = 0;
//		int[] a = new int[n];
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0)
//				a[index++] = i;
//		}
//		if (n <= 1) {
//			return n == 0 ? 0 : 1;
//		} else {
//			while (index >= 0) {
//				answer += a[index--];
//			}
//			return answer;
//		}
	}
}
