package brute_force_search;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MockExam {
//	모의고사
	public int[] solution(int[] answers) {
		int[] score = { 0, 0, 0 };
		int[] two = { 1, 3, 4, 5 };
		int[] three = { 3, 1, 2, 4, 5 };
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == i % 5 + 1)
				score[0]++;
			if (i % 2 == 0 && answers[i] == 2 || i % 2 == 1 && answers[i] == two[((i + 1) / 2 - 1) % 4])
				score[1]++;
			if (answers[i] == three[(i / 2) % 5])
				score[2]++;
		}
		return IntStream.rangeClosed(1, 3).filter(i -> score[i - 1] == Arrays.stream(score).max().orElse(0)).toArray();
//		int[] two = { 1, 3, 4, 5 };
//		int[] three = { 3, 1, 2, 4, 5 };
//		int max = 0;
//		List<Integer> m = new ArrayList<Integer>();
//		List<Integer> l = new ArrayList<Integer>();
//		m.add(0);
//		m.add(0);
//		m.add(0);
//
//		for (int i = 0; i < answers.length; i++) {
//			int num = answers[i];
//			if (num == i % 5 + 1) {
//				m.set(0, m.get(0) + 1);
//			}
//			if (i % 2 == 0 && num == 2) {
//				m.set(1, m.get(1) + 1);
//			} else if (i % 2 == 1 && num == two[i / 2 % 4]) {
//				m.set(1, m.get(1) + 1);
//			}
//			if (num == three[i / 2 % 5]) {
//				m.set(2, m.get(2) + 1);
//			}
//		}
//		max = Collections.max(m);
//		for (int i = 0; i < m.size(); i++) {
//			if (max == m.get(i)) {
//				l.add(i + 1);
//			}
//		}
//		return l.stream().mapToInt(i -> i).toArray();
	}
}