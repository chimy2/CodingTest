package brute_force_search;

//피로도
public class Fatigue {
	private boolean[] visit;
	private int answer = 0;

	public int solution(int k, int[][] dungeons) {

		int n = dungeons.length;

		visit = new boolean[n];

		for (int i = 0; i < n; i++) {
			visit[i] = true;
			recursion(dungeons, i, k, 1);
			visit[i] = false;
		}

		return answer;
	}

	public void recursion(int[][] arr, int last, int remain, int count) {
		if (remain < arr[last][0])
			return;

		for (int i = 0; i < arr.length; i++) {
			if (!visit[i]) {
				visit[i] = true;
				recursion(arr, i, remain - arr[last][1], count + 1);
				visit[i] = false;
			}
		}

		this.answer = Math.max(this.answer, count);
	}
}