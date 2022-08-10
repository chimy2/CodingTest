package introduction_coding_tests;

public class CursedNumber3 {
//	저주의 숫자3
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++, answer++) {
			while (answer % 3 == 0 || String.valueOf(answer).contains("3"))
				answer++;
		}
		return answer - 1;
	}
}