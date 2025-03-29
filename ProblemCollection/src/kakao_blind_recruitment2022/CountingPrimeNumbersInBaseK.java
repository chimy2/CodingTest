package kakao_blind_recruitment2022;

import java.util.Arrays;

// k진수에서 소수 개수 구하기
public class CountingPrimeNumbersInBaseK {

	public int solution(int n, int k) {
		int answer = 0;
		long[] arr = Arrays.stream(Long.toString(n, k).split("0+")).mapToLong(Long::parseLong).toArray();

		for (long i : arr) {
			if (i >= 2 && isPrime(i))
				answer++;
		}

		return answer;
	}

	private boolean isPrime(long num) {
		long max = (long) Math.sqrt(num);
		for (long i = 2; i <= max; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}