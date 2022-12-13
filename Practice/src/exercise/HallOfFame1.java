package exercise;

public class HallOfFame1 {
//	명예의 전당 (1)
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		int[] arr = new int[k];
		for (int i = 0; i < score.length; i++) {
			int min = score[i];
			for (int j = 0; j < k; j++) {
				if (min > arr[j]) {
					int temp = arr[j];
					arr[j] = min;
					min = temp;
				}
			}
			answer[i] = arr[Math.min(i, k - 1)];
		}
		return answer;
	}
}