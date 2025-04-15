package exercise;

//	광물 캐기
public class MiningMinerals {

	private int answer;

	public int solution(int[] picks, String[] minerals) {
		int count = picks[0] + picks[1] + picks[2];
		int max = Math.min(count, (int) Math.ceil(minerals.length / 5.0));
		int[] arr = new int[max];
		int[] mins = new int[minerals.length];

		answer = 50 * 25;

		for (int i = 0; i < minerals.length; i++) {
			if (minerals[i].equals("diamond")) {
				mins[i] = 2;
			} else if (minerals[i].equals("iron")) {
				mins[i] = 1;
			} else {
				mins[i] = 0;
			}
		}

		permutation(picks, mins, arr, 0, max);

		return answer;
	}

	public void permutation(int[] picks, int[] mins, int[] arr, int cnt, int max) {
		if (cnt == max) {
			work(mins, arr);
			return;
		}

		for (int i = 0; i < 3; i++) {
			if (picks[i] > 0) {
				picks[i]--;

				arr[cnt] = 2 - i;
				permutation(picks, mins, arr, cnt + 1, max);

				picks[i]++;
			}
		}
	}

	public void work(int[] mins, int[] arr) {
		int sum = 0;

		for (int i = 0, j = -1; i < mins.length; i++) {
			if (i % 5 == 0)
				j++;
			if (j >= arr.length)
				break;
			sum += mins[i] > arr[j] ? Math.pow(5, mins[i] - arr[j]) : 1;
		}

		answer = Math.min(answer, sum);
	}
}