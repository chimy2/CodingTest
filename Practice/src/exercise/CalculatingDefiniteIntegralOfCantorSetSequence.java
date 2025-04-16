package exercise;

import java.util.ArrayList;
import java.util.List;

//	우박수열 정적분
public class CalculatingDefiniteIntegralOfCantorSetSequence {

	public double[] solution(int k, int[][] ranges) {
		double[] answer = new double[ranges.length];
		List<Double> area = new ArrayList<Double>();

		int before = k;
		while (before != 1) {
			int temp = before;
			if (before % 2 == 0) {
				temp = before / 2;
			} else {
				temp = before * 3 + 1;
			}

			int max = Math.max(before, temp);
			int min = Math.min(before, temp);

			area.add(min + (max - min) / 2.0);
			before = temp;
		}

		for (int i = 0; i < ranges.length; i++) {
			int start = ranges[i][0];
			int end = area.size() + ranges[i][1];

			if (start - end > 0) {
				answer[i] = -1;
			}
			for (int j = start; j < end; j++) {
				answer[i] += area.get(j);
			}
		}
		return answer;
	}
}