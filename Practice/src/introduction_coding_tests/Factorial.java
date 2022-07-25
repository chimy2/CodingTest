package introduction_coding_tests;

public class Factorial {
//	팩토리얼
	public int solution(int n) {
		for (int i = 2, j = 1;; i++) {
			if (i * j > n)
				return i - 1;
			j *= i;
		}
	}
}