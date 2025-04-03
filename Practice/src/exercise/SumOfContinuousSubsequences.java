package exercise;

//	연속된 부분 수열의 합
public class SumOfContinuousSubsequences {

	public int[] solution(int[] sequence, int k) {
		int[] answer = { 0, 1000000 };

		int n = sequence.length;
		int start = 0;
		int end = -1;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int num = sequence[i];
			sum += num;
			end = i;

			if (sum > k) {
				while (start < end && sum > k) {
					sum -= sequence[start++];
				}
			}

			if (sum == k) {
				if (answer[1] - answer[0] > end - start) {
					answer[0] = start;
					answer[1] = end;
				}
			}
		}

		return answer;
	}
}