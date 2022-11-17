package dev_matching_web_backend_developer_firsthalf2021;

public class HighestAndLowestRankInLotto {
//	로또의 최고 순위와 최저 순위
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = { 0, 0 };
		for (int n : lottos) {
			if (n == 0) {
				answer[1]++;
			} else {
				for (int win : win_nums) {
					if (n == win) {
						answer[0]++;
						answer[1]++;
						break;
					}
				}
			}
		}
		if (answer[0] == 7)
			answer[0]--;
		if (answer[1] == 7)
			answer[1]--;
		return answer;
//		int[] answer = new int[2];
//		int win = 0;
//		int zero = 0;
//		Arrays.sort(lottos);
//		Arrays.sort(win_nums);
//		for (int i = 0, j = 0; i < lottos.length && j < win_nums.length;) {
//			if (lottos[i] == 0) {
//				zero++;
//				i++;
//			} else if (lottos[i] == win_nums[j]) {
//				win++;
//				i++;
//				j++;
//			} else if (lottos[i] < win_nums[j]) {
//				i++;
//			} else {
//				j++;
//			}
//		}
//		answer[0] = win + zero > 1 ? 7 - win - zero : 6;
//		answer[1] = win > 1 ? 7 - win : 6;
//		return answer;
	}
}