package introduction_coding_tests;

public class LengthOfOverlappingSegments {
//	겹치는 선분의 길이
	public int solution(int[][] lines) {
		int answer = 0;
		int[] arr = new int[201];
		for (int i = 0; i < 3; i++) {
			for (int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
				arr[j]++;
			}
		}
		for (int i : arr) {
			if (i > 1)
				answer++;
		}
		return answer;
	}
}