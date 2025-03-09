package pcce_past_exam_question;

// [PCCE 기출문제] 10번 / 공원
public class Park {

	public int solution(int[] mats, String[][] park) {
		int answer = -1;

		int[][] dp = new int[park.length + 2][park[0].length + 2];
		int max = 0;

		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length; j++) {
				int temp = 0;

				if (park[i][j].equals("-1")) {
					if (isEquals(dp, i, j)) {
						temp = dp[i][j] + 1;
					} else {
						int min = getMin(dp, i, j) + 1;

						temp = min;
					}
				}
				max = Math.max(max, temp);
				dp[i + 1][j + 1] = temp;
			}
		}

		for (int i = 0; i < mats.length; i++) {
			if (mats[i] <= max) {
				answer = Math.max(answer, mats[i]);
			}
		}

		return answer;
	}

	public int getMin(int[][] arr, int i, int j) {
		return Math.min(Math.min(arr[i][j], arr[i][j + 1]), arr[i + 1][j]);
	}

	public boolean isEquals(int[][] arr, int i, int j) {
		if (arr[i][j] == arr[i][j + 1] && arr[i][j] == arr[i + 1][j]) {
			return true;
		}
		return false;
	}
}
