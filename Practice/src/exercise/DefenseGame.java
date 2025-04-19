package exercise;

import java.util.Comparator;
import java.util.PriorityQueue;

//	디펜스 게임
public class DefenseGame {
	public int solution(int n, int k, int[] enemy) {
		int answer = 0;
		PriorityQueue<Integer> nums = new PriorityQueue<Integer>(Comparator.reverseOrder());

		for (int e : enemy) {
			n -= e;
			nums.add(e);
			if (n < 0) {
				if (k > 0) {
					for (; k > 0 && n < 0; k--) {
						n += nums.poll();
					}
				} else {
					break;
				}
			}
			answer++;
		}
		return answer;
	}
}