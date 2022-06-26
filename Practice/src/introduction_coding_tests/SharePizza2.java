package introduction_coding_tests;

public class SharePizza2 {
//	피자 나눠 먹기 (2)
	public int solution(int n) {
		for (int i = 1;; i++) {
			if (i * 6 % n == 0)
				return i;
		}
	}
}