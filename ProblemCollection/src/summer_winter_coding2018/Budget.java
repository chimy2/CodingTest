package summer_winter_coding2018;

import java.util.Arrays;

public class Budget {
//	예산
	public int solution(int[] d, int budget) {
		int result = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length && d[i] <= budget; i++) {
			budget -= d[i];
			result++;
		}

		return result;
	}
}
