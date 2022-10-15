package exercise;

public class CollatzConjecture {
//	콜라츠 추측
	public int solution(int num) {
		int answer = 0;
		while (num != 1) {
			num = num % 2 == 0 ? num / 2 : num * 3 + 1;
			answer++;
			if (answer > 500 || num >= Math.pow(10, 9))
				return -1;
		}
		return answer;
	}

	public int solution(long n) {
		int answer = 0;
		for (int i = 0; i < 500; i++) {
			if (n == 1)
				break;
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n = n * 3 + 1;
			}
			answer++;
		}
		if (answer == 500)
			answer = -1;
		return answer;
	}
}
