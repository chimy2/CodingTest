package exercise;

import java.util.LinkedList;
import java.util.Queue;

// 숫자 변환하기
public class ConvertingNumbers {

	public int solution(int x, int y, int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		int[] dp = new int[y + 1];

		for (int i = 0; i < dp.length - 1; i++) {
			dp[i] = 100000;
		}
		q.add(y);

		while (!q.isEmpty()) {
			int num = q.poll();

			if (x >= num || dp[num] > dp[x]) {
				continue;
			}

			addElementDivide(q, dp, num, 3);
			addElementDivide(q, dp, num, 2);
			addElementMinus(q, dp, num, n);

		}

		return dp[x] == 100000 ? -1 : dp[x];
	}

	public void addElementDivide(Queue<Integer> q, int[] dp, int num, int n) {
		int temp = num / n;

		if (num % n == 0 && dp[num] + 1 < dp[temp]) {
			q.add(temp);
			dp[temp] = Math.min(dp[num] + 1, dp[temp]);
		}
	}

	public void addElementMinus(Queue<Integer> q, int[] dp, int num, int n) {
		int temp = num - n;

		if (temp > 0 && dp[num] + 1 < dp[temp]) {
			q.add(temp);
			dp[temp] = Math.min(dp[num] + 1, dp[temp]);
		}
	}
}