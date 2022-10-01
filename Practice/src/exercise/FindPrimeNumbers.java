package exercise;

public class FindPrimeNumbers {
//	소수 찾기
	public int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			if (!arr[i]) {
				for (int j = i + i; j <= n; j += i)
					arr[j] = true;
				answer++;
			}
		}
		return answer;
//		int answer = 0;
//		boolean[] arr = new boolean[n + 1];
//		for (int i = 2; i < arr.length; i++) {
//			if (!arr[i]) {
//				answer++;
//				for (int j = (int) Math.pow(i, 2); j <= n; j += i) {
//					arr[j] = true;
//				}
//			}
//		}
//		return answer;
	}
}