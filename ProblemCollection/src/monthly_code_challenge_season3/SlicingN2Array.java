package monthly_code_challenge_season3;

// n^2 배열 자르기
public class SlicingN2Array {

	public int[] solution(int n, long left, long right) {
		int[] answer = new int[(int) (right - left + 1)];

		int count = 0;
		int startRow = (int) (left / n);
		int endRow = (int) (right / n);

		for (int i = startRow; i <= endRow; i++) {

			int startCol = (i == startRow) ? (int) (left % n) : 0;
			int endCol = (i == endRow) ? (int) (right % n) : n - 1;

			for (int j = startCol; j <= endCol; j++) {
				answer[count++] = Math.max(i, j) + 1;
			}
		}
		return answer;
	}
}