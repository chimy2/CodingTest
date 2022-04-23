package coding_basic_training;

import java.util.Arrays;

public class OperationsBasedOnLength {
//	길이에 따른 연산
	public int solution(int[] num_list) {
		return num_list.length > 10 ? Arrays.stream(num_list).reduce(0, Integer::sum)
				: Arrays.stream(num_list).reduce(1, (ac, c) -> ac * c);
	}
}
