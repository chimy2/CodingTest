package kakao_blind_recruitment2022;

import java.util.Arrays;

//	양궁대회
public class ArcheryContest {
	private int gap;
	private int[] answer;

	public int[] solution(int n, int[] info) {
		answer = new int[11];
		int[] arr = new int[11];

		dfs(n, info, arr, 0, 0);

		return gap > 0 ? answer : new int[] { -1 };
	}

	public void dfs(int n, int[] info, int[] arr, int idx, int cnt) {
		if (idx == 11) {
			if (n == cnt) {
				checkAndSetScore(info, arr);
			}
			return;
		}
		for (int i = 0; i <= n - cnt; i++) {
			arr[idx] = i;
			dfs(n, info, arr, idx + 1, cnt + i);
			arr[idx] = 0;
		}
	}

	public void checkAndSetScore(int[] info, int[] arr) {
		int apeach = 0;
		int ryan = 0;

		for (int i = 0; i < 11; i++) {
			if (info[i] + arr[i] == 0)
				continue;
			if (info[i] >= arr[i]) {
				apeach += 10 - i;
			} else {
				ryan += 10 - i;
			}
		}
		if (apeach < ryan) {
			if (isBetterScore(arr, ryan - apeach)) {
				answer = Arrays.copyOf(arr, arr.length);
			}
		}
	}

	public boolean isBetterScore(int[] arr, int gap) {
		if (gap > this.gap) {
			this.gap = gap;
			return true;
		} else if (gap < this.gap) {
			return false;
		}
		for (int i = 10; i >= 0; i--) {
			if (arr[i] > answer[i]) {
				return true;
			} else if (arr[i] < answer[i]) {
				return false;
			}
		}
		return false;
	}
}