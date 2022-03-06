package coding_basic_training;

import java.util.Arrays;

public class LastTwoElements {
//	마지막 두 원소
	public int[] solution(int[] num_list) {
		int len = num_list.length;
		int[] answer = Arrays.copyOf(num_list, len + 1);
		int a = num_list[len - 2];
		int b = num_list[len - 1];
		if (a >= b) {
			answer[len] = b * 2;
		} else {
			answer[len] = b - a;
		}
		return answer;
	}
}
