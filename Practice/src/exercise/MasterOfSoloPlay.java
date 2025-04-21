package exercise;

import java.util.Comparator;
import java.util.PriorityQueue;

//	혼자 놀기의 달인
public class MasterOfSoloPlay {

	public int solution(int[] cards) {
		int n = cards.length;
		boolean[] check = new boolean[n];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			if (!check[i]) {
				int idx = i;
				int cnt = 0;
				while (!check[idx]) {
					check[idx] = true;
					idx = cards[idx] - 1;
					cnt++;
				}

				pq.add(cnt);
			}
		}
		return pq.size() > 1 ? pq.poll() * pq.poll() : 0;
	}
}