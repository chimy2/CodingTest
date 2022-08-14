package introduction_coding_tests;

public class Ranking {
//	등수 매기기
	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}
		return answer;
	}
}