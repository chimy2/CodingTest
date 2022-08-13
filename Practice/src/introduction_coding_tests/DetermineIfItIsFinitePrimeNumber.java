package introduction_coding_tests;

public class DetermineIfItIsFinitePrimeNumber {
//	유한소수 판별하기
	public int solution(int a, int b) {
		for (int i = 2; i <= a;) {
			if (b % i == 0 && a % i == 0) {
				b /= i;
				a /= i;
			} else {
				i++;
			}
		}
		for (int i = 2; b >= 2;) {
			if (i > 5)
				return 2;
			if (b % i == 0)
				b /= i;
			else {
				i += 3;
			}
		}
		return 1;
	}
}