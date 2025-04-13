package pccp_past_exam_question;

//	[PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
public class PuzzleGameChallenge {

	public int solution(int[] diffs, int[] times, long limit) {
		int l = 1, r = 0, m = 0;

		for (int diff : diffs) {
			r = Math.max(r, diff);
		}
		while (l < r) {
			m = (l + r) / 2;

			boolean temp = isPass(diffs, times, limit, m);

			if (!temp) {
				r = m;
			} else {
				l = m + 1;
			}
		}

		return l;
	}

	public boolean isPass(int[] diffs, int[] times, long limit, int lv) {
		long time = 0;

		for (int i = 0; i < diffs.length; i++) {
			if (lv < diffs[i]) {
				int gap = diffs[i] - lv;
				time += gap * (times[i - 1] + times[i]) + times[i];
			} else {
				time += times[i];
			}
			if (time > limit)
				break;
		}

		return time > limit;
	}
}