package introduction_coding_tests;

public class NumberOfOrderedPairs {
//	순서쌍의 개수
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i * i < n; i++) {
			if (n % i == 0) {
				if (i * i == n) {
					answer++;
				} else {
					answer += 2;
				}
			}
		}
		return answer;
//        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
//		for (int i = 1; i <= n; i++) {
//			for (int j = n; j > 0; j--) {
//				if (i * j == n) {
//					answer++;
//					break;
//				}
//			}
//		}
	}
}