package exercise;

public class FruitMerchant {
//	과일 장수
	public int solution(int k, int m, int[] score) {
		int answer = 0;
		int[] arr = new int[k + 1];
		for (int i : score) {
			arr[i]++;
		}
		for (int i = k; i > 0; i--) {
			answer += i * (arr[i] / m) * m;
			arr[i - 1] += arr[i] % m;
		}
		return answer;
	}
}