package programmers_codechallenge2025_round2;

// 서버 증설 횟수
public class ServerExpansionCount {

	public int solution(int[] players, int m, int k) {
		int answer = 0;

		int len = players.length;
		int[] arr = new int[len + 1];
		int count = 0;

		for (int i = 0; i < len; i++) {
			count -= arr[i];

			int div = players[i] / m;

			if (div > count) {
				int temp = div - count;
				answer += temp;
				arr[Math.min(len, i + k)] = temp;
				count = div;
			}
		}

		return answer;
	}
}