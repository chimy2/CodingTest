package introduction_coding_tests;

public class FindCompositeNumbers {
//	합성수 찾기
	public int solution(int n) {
		int answer = 0;
		for (int i = 4; i <= n; i++) {
			int temp = i;
			int count = 0;
			for (int j = 2; j < i && count < 2;) {
				if (temp % j == 0) {
					temp /= j;
					count++;
				} else {
					j++;
				}
			}
			if (count >= 2)
				answer++;
		}
		return answer;
	}
}