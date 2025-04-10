package kakao_tech_internship2022;

//	두 큐 합 같게 만들기
public class MakingTwoQueuesHaveSameSum {

	public int solution(int[] queue1, int[] queue2) {
		int answer = 0;
		int n = queue1.length;
		long num1 = 0;
		long num2 = 0;

		for (int i = 0; i < n; i++) {
			num1 += queue1[i];
			num2 += queue2[i];
		}

		long goal = (long) ((num1 + num2) / 2);
		long temp = num1;

		for (int l = 0, r = 0; l < 2 * n && r < 2 * n;) {
			if (temp == goal)
				break;
			if (temp < goal) {
				temp += r / n % 2 == 0 ? queue2[r++ % n] : queue1[r++ % n];
			} else {
				temp -= l / n % 2 == 0 ? queue1[l++ % n] : queue2[l++ % n];
			}
			answer++;
		}

		return temp == goal ? answer : -1;
	}
}