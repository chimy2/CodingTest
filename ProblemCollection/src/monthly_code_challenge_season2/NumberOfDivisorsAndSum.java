package monthly_code_challenge_season2;

public class NumberOfDivisorsAndSum {
//	약수의 개수와 덧셈
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= Math.sqrt(i); j++) {
				if (j * j == i)
					count++;
				else if (i % j == 0)
					count += 2;

			}
			answer += count % 2 == 0 ? i : -i;
		}
		return answer;
//		int answer = 0;
//		for (int i = left; i <= right; i++) {
//			int count = 1;
//			for (int j = 2; j <= i; j++) {
//				if (i % j == 0)
//					count++;
//			}
//			answer += count % 2 == 0 ? i : -i;
//		}
//		return answer;
	}
}